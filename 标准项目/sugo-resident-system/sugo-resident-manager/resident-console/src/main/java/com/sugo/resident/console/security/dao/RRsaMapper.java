package com.sugo.resident.console.security.dao;

import com.sugo.resident.console.security.model.RsaDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户相关dao
 * @author lenovo
 *
 */
@Mapper
@Repository
public interface RRsaMapper {
	//查询RSA信息
    RsaDTO queryRsaInfo(RsaDTO rsaDTO);
}