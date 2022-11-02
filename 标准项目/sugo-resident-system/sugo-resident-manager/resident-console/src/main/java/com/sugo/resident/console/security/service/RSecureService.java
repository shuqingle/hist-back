package com.sugo.resident.console.security.service;


import com.sugo.resident.console.ruser.model.UserInfoDto;
import com.sugo.resident.console.ruser.model.UserInfoVO;
import com.sugo.resident.console.security.model.RsaDTO;

/**
 * @ClassName AuthManageService
 * @Description TODO
 * @Autor lenovo
 * @Date 2020-06-03 21:41
 * @Version 1.0
 **/
public interface RSecureService {
	//登录
	String getPublicRsaKey(RsaDTO rsaDTO) throws Exception;

    
}
