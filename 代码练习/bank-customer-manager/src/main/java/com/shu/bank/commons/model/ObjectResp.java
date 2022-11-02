package com.shu.bank.commons.model;

import lombok.Data;
import lombok.EqualsAndHashCode;



public class ObjectResp<T> extends BaseResp {
	T data;

	public ObjectResp(String code, String message) {
		super(code, message);
	}

	public ObjectResp(String code, String message, T data) {
		super(code, message);
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ObjectResp() {
		super();
	}
}
