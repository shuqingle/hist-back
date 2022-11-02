package com.sugo.resident.console.ruser.model;

import lombok.Data;

@Data
public class UserInfoDto {

    /////////////请求参数////////////
    private String tellerNo;
    private String passWord;
    private String verifyCode;


    /////////////过渡变量////////////
    private UserInfoVO userInfoVO;


}
