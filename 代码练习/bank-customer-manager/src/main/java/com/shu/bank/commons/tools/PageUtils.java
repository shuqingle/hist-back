package com.shu.bank.commons.tools;

import com.shu.bank.commons.enumInfo.ResultCodeInfo;
import com.shu.bank.commons.model.PageInfo;
import com.shu.bank.commons.model.TableResp;

import java.util.List;

public class PageUtils<T> {
	//返回分页错误消息
	public TableResp<T> error(String code, String message){
		TableResp<T> tableResult = new TableResp<T>();
		tableResult.setCode(code);
		tableResult.setMessage(message);
		return tableResult;
	}
	
	//返回正确分页消息
	public TableResp<T> right(List<T> list){
		TableResp<T> tableResult = new TableResp<T>();
		tableResult.setCode(ResultCodeInfo.SUCCESS.code());
		tableResult.setMessage(ResultCodeInfo.SUCCESS.message());
		tableResult.setData(this.toObtainPageInfo(list));
		return tableResult;
	}
	//从pageHelper插件中获取总记录数并封装到响应体中
	private PageInfo<T> toObtainPageInfo(List<T> list) {
		PageInfo<T> pResult = new PageInfo<T>();
		com.github.pagehelper.PageInfo<T> pages = new com.github.pagehelper.PageInfo<>(list);
		pResult.setTotal((int) pages.getTotal());
		pResult.setData(list);
		return pResult;
	}
	
	@SuppressWarnings("unused")
	public TableResp<T> setPageInfo(int count,List<T> list){
		TableResp<T> tableResult = new TableResp<T>();
		PageInfo<T> pResult = new PageInfo<>();
		com.github.pagehelper.PageInfo<T> pageInfo = new com.github.pagehelper.PageInfo<>(list);
		pResult.setTotal(count);
		pResult.setData(list);
		tableResult.setData(pResult);
		tableResult.setMessage("交易处理成功");
		return tableResult;
	}
}
