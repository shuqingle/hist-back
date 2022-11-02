package com.sugo.resident.console.ruser.service;


import com.sugo.resident.console.ruser.model.UserInfoDto;
import com.sugo.resident.console.ruser.model.UserInfoVO;

/**
 * @ClassName AuthManageService
 * @Description TODO
 * @Autor lenovo
 * @Date 2020-06-03 21:41
 * @Version 1.0
 **/
public interface RUserService {
	//登录
	UserInfoVO login(UserInfoDto userInfoDto) throws Exception;

    
}
