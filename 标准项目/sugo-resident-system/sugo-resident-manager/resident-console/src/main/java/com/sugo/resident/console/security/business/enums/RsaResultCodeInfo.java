package com.sugo.resident.console.security.business.enums;


import com.sugo.resident.commonapi.enumInfo.ResultCodeInterface;

public enum RsaResultCodeInfo implements ResultCodeInterface {
	//==============系统错误==============
	RSA_QUERY_ERROR("SYS-REDIS-0001","获取redis信息失败！");
	
	
	
	
	
	
	private RsaResultCodeInfo(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	private String code;
    private String msg;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String code() {
		return code;
	}

	@Override
	public String message() {
		return msg;
	}
}
