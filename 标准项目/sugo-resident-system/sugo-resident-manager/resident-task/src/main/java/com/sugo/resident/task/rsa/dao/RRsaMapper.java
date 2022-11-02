package com.sugo.resident.task.rsa.dao;

import com.sugo.resident.task.rsa.model.RsaDTO;
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
	//删除指定日期的rsa密钥对信息
    void deleteRsa(RsaDTO rsaDTO);
    //新增rsa密钥对
    void addRsa(RsaDTO rsaDTO);
}