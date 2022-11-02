package com.sugo.resident.console.ruser.business.actions.checks;


import com.sugo.resident.commonapi.business.action.AbstractBusinessAction;
import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.utils.BusinessUtil;
import com.sugo.resident.console.ruser.business.enums.UserResultCodeInfo;
import com.sugo.resident.console.ruser.model.UserInfoDto;
import org.springframework.util.StringUtils;

public class UserTellerPassWordNotNullCheckAction extends AbstractBusinessAction<UserInfoDto> {
    public UserTellerPassWordNotNullCheckAction(BusinessBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        if(StringUtils.isEmpty(this.data().getPassWord())){
            //密码非空检查
            BusinessUtil.stopBusiProcess(UserResultCodeInfo.USER_NO_PASS_EMPTY_ERROR);
        }
    }
}
