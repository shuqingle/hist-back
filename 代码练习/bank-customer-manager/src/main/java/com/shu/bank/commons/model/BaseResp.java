package com.shu.bank.commons.model;

import com.shu.bank.commons.consts.CommonConst;
import com.shu.bank.commons.enumInfo.ResultCodeInfo;
import lombok.Data;

@Data
public class BaseResp {
	// 返回码
	private String code = CommonConst.SUCCESS;
	// 返回消息
	private String message;

	// 设置返回码和消息String做参数
	public void setCodeMsg(String code, String message) {
		this.code = code;
		this.message = message;
	}

	// 设置返回码和消息String做参数
	public void setCodeMsg(ResultCodeInfo resultCode) {
		this.code = resultCode.getCode();
		this.message = resultCode.getMsg();
	}

	public BaseResp(String code, String message) {
		this.code = code;
		this.message = message;
	}


	public BaseResp() {
	}
}
