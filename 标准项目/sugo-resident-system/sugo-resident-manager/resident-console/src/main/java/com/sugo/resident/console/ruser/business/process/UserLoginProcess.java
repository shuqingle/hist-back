package com.sugo.resident.console.ruser.business.process;


import com.sugo.resident.commonapi.business.process.AbstractBusinessProcess;
import com.sugo.resident.console.ruser.business.actions.checks.UserTellerPassWordRightCheckAction;
import com.sugo.resident.console.ruser.business.actions.dbases.UserInfoQueryDbAction;
import com.sugo.resident.console.ruser.business.functions.LoginUserBaseInfoCheckFunction;
import com.sugo.resident.console.ruser.model.UserInfoDto;

public class UserLoginProcess extends AbstractBusinessProcess<UserInfoDto> {
    public UserLoginProcess(UserInfoDto userInfoDto) throws Exception {
        super(userInfoDto);
    }

    @Override
    public void createProcess() throws Exception {
        //用户登录信息非空检查
        this.busi = new LoginUserBaseInfoCheckFunction(this.busi);
        //数据库查询用户信息
        this.busi = new UserInfoQueryDbAction(this.busi);
        //检查密码是否正确
        this.busi = new UserTellerPassWordRightCheckAction(this.busi);
        //生成token
    }
}
