package com.sugo.resident.commonapi.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseRequestDto implements Serializable{

	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	//页码
	private int pageNum;
	//页大小
	private int pageSize;
	
}
