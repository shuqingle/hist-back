package com.shu.bank.authorization.business.actions.checks;

import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.commons.busi.action.AbstractBusinessAction;
import com.shu.bank.commons.busi.base.BusiBase;
import com.shu.bank.commons.enumInfo.ResultCodeInfo;
import com.shu.bank.commons.tools.CommonTools;
import org.thymeleaf.util.StringUtils;

public class UserTellerPassWordNotNullCheckAction extends AbstractBusinessAction<UserInfoDto> {
    public UserTellerPassWordNotNullCheckAction(BusiBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        if(StringUtils.isEmpty(this.data().getPassWord())){
            //密码非空检查
            CommonTools.stopBusiProcess(ResultCodeInfo.USER_NO_PASS_EMPTY_ERROR);
        }
    }
}
