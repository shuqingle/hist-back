package com.shu.bank.commons.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


public class TableResp<T> extends BaseResp{
	PageInfo<T> data;


	public TableResp(String code, String message) {
		super(code, message);
	}

	public PageInfo<T> getData() {
		return data;
	}

	public void setData(PageInfo<T> data) {
		this.data = data;
	}

	public TableResp() {
	}
}
