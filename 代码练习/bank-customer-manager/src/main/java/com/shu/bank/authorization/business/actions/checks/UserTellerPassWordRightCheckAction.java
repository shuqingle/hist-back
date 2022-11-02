package com.shu.bank.authorization.business.actions.checks;

import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.commons.busi.action.AbstractBusinessAction;
import com.shu.bank.commons.busi.base.BusiBase;
import com.shu.bank.commons.enumInfo.ResultCodeInfo;
import com.shu.bank.commons.tools.CommonTools;

public class UserTellerPassWordRightCheckAction extends AbstractBusinessAction<UserInfoDto> {
    public UserTellerPassWordRightCheckAction(BusiBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        if(!this.data().getPassWord().equals(this.data().getUserInfoVO().getPassWord())){
            CommonTools.stopBusiProcess(ResultCodeInfo.USER_NO_PASS_WRONG_ERROR);
        }
    }
}
