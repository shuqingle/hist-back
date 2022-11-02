package com.shu.bank.authorization.business.functions;

import com.shu.bank.authorization.business.actions.checks.UserTellerNoNotNullCheckAction;
import com.shu.bank.authorization.business.actions.checks.UserTellerPassWordNotNullCheckAction;
import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.commons.busi.base.BusiBase;
import com.shu.bank.commons.busi.function.AbstractBusinessFunction;

public class LoginUserBaseInfoCheckFunction extends AbstractBusinessFunction<UserInfoDto> {
    public LoginUserBaseInfoCheckFunction(BusiBase<UserInfoDto> busi) throws Exception {
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
