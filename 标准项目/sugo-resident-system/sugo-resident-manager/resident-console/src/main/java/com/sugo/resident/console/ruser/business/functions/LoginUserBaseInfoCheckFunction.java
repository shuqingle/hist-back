package com.sugo.resident.console.ruser.business.functions;


import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.business.function.AbstractBusinessFunction;
import com.sugo.resident.console.ruser.business.actions.checks.UserTellerNoNotNullCheckAction;
import com.sugo.resident.console.ruser.business.actions.checks.UserTellerPassWordNotNullCheckAction;
import com.sugo.resident.console.ruser.model.UserInfoDto;

public class LoginUserBaseInfoCheckFunction extends AbstractBusinessFunction<UserInfoDto> {
    public LoginUserBaseInfoCheckFunction(BusinessBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createFunction() throws Exception {
        //用户账号非空检查
        this.busi = new UserTellerNoNotNullCheckAction(this.busi);
        //用户密码非空检查
        this.busi = new UserTellerPassWordNotNullCheckAction(this.busi);
    }
}
