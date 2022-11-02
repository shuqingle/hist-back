package com.sugo.resident.console.roles.business.enums;


import com.sugo.resident.commonapi.enumInfo.ResultCodeInterface;

public enum BankCardErrorResultInfo implements ResultCodeInterface {
	
    
	
	
	//==============银行卡报错信息==============
	BANK_CARD_REPEATE_ERROR("bc0001","银行卡已经存在，请勿重复添加！"),
	BANK_CARD_NO_EMPTY_ERROR("bc0002","银行卡号不能为空！"),
	BANK_CARD_NAME_EMPTY_ERROR("bc0003","银行名称不能为空！"),
	NOT_USER_ERROR("000002","查无此用户信息！");

	
	
	
	
	
	private BankCardErrorResultInfo(String code, String msg) {
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
