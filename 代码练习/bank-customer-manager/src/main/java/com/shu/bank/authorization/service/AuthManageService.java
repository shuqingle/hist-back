package com.shu.bank.authorization.service;


import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.authorization.model.UserInfoVO;

/**
 * @ClassName AuthManageService
 * @Description TODO
 * @Autor lenovo
 * @Date 2020-06-03 21:41
 * @Version 1.0
 **/
public interface AuthManageService {
	//登录
	UserInfoVO login(UserInfoDto userInfoDto) throws Exception;

    
}
