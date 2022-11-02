$(function(){
    RUser.init();
})

var RUser = {
    init : function(){

        //后台获取验证码

        //后台获取公钥

        //登录点击事件
        this.userLoginEvent();
        
    },












    //登录点击事件
    userLoginEvent : function(){
        $("#userLogin").bind("click",function(){
            
            var userName = $("#username").val().trim();
            var passWord = $("#password").val().trim();
            if('' == userName || typeof userName == 'undefined'){
                alert("用户名不能为空")
                return;
            }
            if(userName.length > 32 || userName.length < 6){
                alert("用户名长度应在6-32之间")
                return;
            }
            if('' == passWord || typeof passWord == 'undefined'){
                alert("密码不能为空")
                return;
            }
            if(passWord.length > 32 || passWord.length < 6){
                alert("密码长度应在6-32之间")
                return;
            }
            //验证码检查

            //密码rsa加密
            var PUBLIC_KEY = 'MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC8HMr2CBpoZPm3t9tCVlrKtTmI4jNJc7/HhxjIEiDjC8czP4PV+44LjXvLYcSV0fwi6nE4LH2c5PBPEnPfqp0g8TZeX+bYGvd70cXee9d8wHgBqi4k0J0X33c0ZnW7JruftPyvJo9OelYSofBXQTcwI+3uIl/YvrgQRv6A5mW01QIDAQAB';
            var encrypt = new JSEncrypt();
            encrypt.setPublicKey(PUBLIC_KEY);
            var encPass = encrypt.encrypt(JSON.stringify(passWord));
            location.href = "./index.html";
            // RUser.userLoginApi(userName,encPass);
        })
    },
    userLoginApi : function(userName,encPass){

        $.ajax({
            url:"/sql/resident/sugo/sugo-resident-console/console/ruser/login",
            type:"POST",
            contentType: "application/json",
            dataType:"json",
            data: JSON.stringify({
                "tellerNo":userName,
                "passWord":encPass
            }),
            success:function(data){
                if("200" == data.code){
                    //跳转到首页
                    location.href = "./index.html";
                }else{
                    alert(data.msg);
                }
            }
        });
    }
}