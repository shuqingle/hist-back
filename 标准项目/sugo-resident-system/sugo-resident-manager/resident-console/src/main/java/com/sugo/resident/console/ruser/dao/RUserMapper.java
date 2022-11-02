package com.sugo.resident.console.ruser.dao;

import com.sugo.resident.console.ruser.model.UserInfoDto;
import com.sugo.resident.console.ruser.model.UserInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户相关dao
 * @author lenovo
 *
 */
@Mapper
@Repository
public interface RUserMapper{

	//获取登录用户信息
	UserInfoVO queryUserLoginInfo(UserInfoDto loginUserDto);

}