package com.shu.bank.commons.enumInfo;

import com.shu.bank.commons.exception.ResultCodes;

public enum ResultCodeInfo implements ResultCodes {
	
    
	
	
	//==============权限==============
	LOGIN_ERROR("000001","登录异常"),
	NOT_USER_ERROR("000002","查无此用户信息！"),
	USER_NO_PASS_EMPTY_ERROR("000003","请输入账号或密码！"),
	USER_NO_PASS_WRONG_ERROR("000003","账号或密码错误！"),

	
	
	//==============公共==============
	SUCCESS("000000","交易处理成功"),
	SYSTEM_ERROR("555555","系统异常"),
	OPERATE_FAIRE("111111","操作失败"),
	PAGE_PARAM_ERROR("333333","分页参数错误！"),
	ILEGAL_USER_ERROR("444444","非法用户！");
	
	
	
	
	
	
	private ResultCodeInfo(String code, String msg) {
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
