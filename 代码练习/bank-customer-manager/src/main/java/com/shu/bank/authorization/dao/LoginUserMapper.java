package com.shu.bank.authorization.dao;

import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.authorization.model.UserInfoVO;
import org.springframework.stereotype.Repository;

/**
 * 用户相关dao
 * @author lenovo
 *
 */
@Repository
public interface LoginUserMapper {

	//获取登录用户信息
	UserInfoVO queryUserLoginInfo(UserInfoDto loginUserDto);

}