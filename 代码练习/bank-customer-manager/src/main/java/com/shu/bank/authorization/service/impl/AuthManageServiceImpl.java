package com.shu.bank.authorization.service.impl;

import com.shu.bank.authorization.business.actions.checks.UserTellerPassWordRightCheckAction;
import com.shu.bank.authorization.business.actions.dbases.UserInfoQueryDbAction;
import com.shu.bank.authorization.business.conversions.UserLoginBusiConversion;
import com.shu.bank.authorization.business.functions.LoginUserBaseInfoCheckFunction;
import com.shu.bank.authorization.business.process.UserLoginProcess;
import com.shu.bank.authorization.dao.LoginUserMapper;
import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.authorization.model.UserInfoVO;
import com.shu.bank.authorization.service.AuthManageService;
import com.shu.bank.commons.busi.process.AbstractBusinessProcess;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName SysUserServiceImpl
 * @Autor lenovo
 * @Date 2019-05-20 21:43
 * @Version 1.0
 **/

@Service
@Transactional
@Slf4j
public class AuthManageServiceImpl implements AuthManageService {

    @Override
    public UserInfoVO login(UserInfoDto userInfoDto) throws Exception {
//		AbstractBusinessProcess<UserInfoDto> process = new UserLoginProcess(new UserLoginBusiConversion(userInfoDto));
//		return process.executeWithResp().getUserInfoVO();

        return new AbstractBusinessProcess<UserInfoDto>(new UserLoginBusiConversion(userInfoDto)) {
            @Override
            protected void createProcess() throws Exception {
                //用户登录信息非空检查
                this.busi = new LoginUserBaseInfoCheckFunction(this.busi);
                //查询数据库中用户是否存在
                this.busi = new UserInfoQueryDbAction(this.busi);
                //密码是否正确检查
                this.busi = new UserTellerPassWordRightCheckAction(this.busi);
                //数据生成token
            }
        }.executeWithResp().getUserInfoVO();
    }
}
