package com.sugo.resident.console.security.service.impl;

import com.sugo.resident.commonapi.business.process.AbstractBusinessProcess;
import com.sugo.resident.console.ruser.business.process.UserLoginProcess;
import com.sugo.resident.console.ruser.dao.RUserMapper;
import com.sugo.resident.console.ruser.model.UserInfoDto;
import com.sugo.resident.console.ruser.model.UserInfoVO;
import com.sugo.resident.console.ruser.service.RUserService;
import com.sugo.resident.console.security.business.process.GetRsaPublicKeyProcess;
import com.sugo.resident.console.security.model.RsaDTO;
import com.sugo.resident.console.security.service.RSecureService;
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
public class RSecureServiceImpl implements RSecureService {

    @Override
    public String getPublicRsaKey(RsaDTO rsaDTO) throws Exception {
        AbstractBusinessProcess<RsaDTO> process = new GetRsaPublicKeyProcess(rsaDTO);
        return process.executeWithResp().getPublicKey();
    }
}
