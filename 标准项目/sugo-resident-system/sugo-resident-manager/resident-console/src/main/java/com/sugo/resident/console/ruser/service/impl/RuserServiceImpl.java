package com.sugo.resident.console.ruser.service.impl;

import com.sugo.resident.commonapi.business.process.AbstractBusinessProcess;
import com.sugo.resident.console.ruser.business.process.UserLoginProcess;
import com.sugo.resident.console.ruser.dao.RUserMapper;
import com.sugo.resident.console.ruser.model.UserInfoDto;
import com.sugo.resident.console.ruser.model.UserInfoVO;
import com.sugo.resident.console.ruser.service.RUserService;
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
public class RuserServiceImpl implements RUserService {

    @Override
    public UserInfoVO login(UserInfoDto userInfoDto) throws Exception {
        //创建执行登录业务流程
        AbstractBusinessProcess<UserInfoDto> process = new UserLoginProcess(userInfoDto);
        //执行登录业务流程并返回用户信息
		return process.executeWithResp().getUserInfoVO();
    }
}
