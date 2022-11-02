package com.shu.bank.commons.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseReq implements Serializable{

	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	//页码
	private int pageIndex;
	//页大小
	private int pageSize;
	
}
