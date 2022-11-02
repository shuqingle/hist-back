package com.shu.bank.commons.model;

import lombok.Data;

import java.util.List;

@Data
public class PageInfo<T> {
	//list数据
	List<T> data;
	//总数量
	int total;
	
}
