package com.sugo.resident.commonapi.model.response;


public class ObjectResponse<T> extends BaseResponse {
	T data;

	public ObjectResponse(String code, String message) {
		super(code, message);
	}

	public ObjectResponse(String code, String message, T data) {
		super(code, message);
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ObjectResponse() {
		super();
	}
}
