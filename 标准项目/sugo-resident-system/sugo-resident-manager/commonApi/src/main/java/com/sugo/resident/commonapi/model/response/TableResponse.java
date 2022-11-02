package com.sugo.resident.commonapi.model.response;


public class TableResponse<T> extends BaseResponse {
	PageInfo<T> data;


	public TableResponse(String code, String message) {
		super(code, message);
	}

	public PageInfo<T> getData() {
		return data;
	}

	public void setData(PageInfo<T> data) {
		this.data = data;
	}

	public TableResponse() {
	}
}
