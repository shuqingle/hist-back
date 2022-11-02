package com.shu.bank.authorization.business.process;

import com.shu.bank.authorization.business.actions.checks.UserTellerPassWordRightCheckAction;
import com.shu.bank.authorization.business.actions.dbases.UserInfoQueryDbAction;
import com.shu.bank.authorization.business.functions.LoginUserBaseInfoCheckFunction;
import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.commons.busi.base.BusiBase;
import com.shu.bank.commons.busi.process.AbstractBusinessProcess;

public class UserLoginProcess extends AbstractBusinessProcess<UserInfoDto> {
    public UserLoginProcess(BusiBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    public void createProcess() throws Exception {
        //用户登录信息非空检查
        this.busi = new LoginUserBaseInfoCheckFunction(this.busi);
        //查询数据库中用户是否存在
        this.busi = new UserInfoQueryDbAction(this.busi);
        //密码是否正确检查
        this.busi = new UserTellerPassWordRightCheckAction(this.busi);
        //数据生成token
    }
}
