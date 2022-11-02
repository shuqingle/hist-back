package com.sugo.resident.console.ruser.business.actions.checks;


import com.sugo.resident.commonapi.business.action.AbstractBusinessAction;
import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.utils.BusinessUtil;
import com.sugo.resident.console.ruser.business.enums.UserResultCodeInfo;
import com.sugo.resident.console.ruser.model.UserInfoDto;

public class UserTellerPassWordRightCheckAction extends AbstractBusinessAction<UserInfoDto> {
    public UserTellerPassWordRightCheckAction(BusinessBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        if(!this.data().getPassWord().equals(this.data().getUserInfoVO().getTellerPassword())){
            BusinessUtil.stopBusiProcess(UserResultCodeInfo.USER_NO_PASS_WRONG_ERROR);
        }
    }
}
