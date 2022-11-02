package com.shu.bank.authorization.business.actions.dbases;

import com.shu.bank.authorization.dao.LoginUserMapper;
import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.authorization.model.UserInfoVO;
import com.shu.bank.commons.busi.action.AbstractBusinessAction;
import com.shu.bank.commons.busi.base.BusiBase;
import com.shu.bank.commons.busi.util.SpringContextUtil;
import com.shu.bank.commons.enumInfo.ResultCodeInfo;
import com.shu.bank.commons.tools.CommonTools;
import org.springframework.util.StringUtils;

import javax.swing.*;

public class UserInfoQueryDbAction extends AbstractBusinessAction<UserInfoDto> {
    private LoginUserMapper loginUserMapper = SpringContextUtil.getBean(LoginUserMapper.class);

    public UserInfoQueryDbAction(BusiBase<UserInfoDto> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        UserInfoVO userInfoVO = loginUserMapper.queryUserLoginInfo(this.data());
        if(userInfoVO == null){
            CommonTools.stopBusiProcess(ResultCodeInfo.NOT_USER_ERROR);
        }
        this.data().setUserInfoVO(userInfoVO);
    }
}
