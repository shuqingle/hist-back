package com.sugo.resident.commonapi.utils;

import com.sugo.resident.commonapi.enumInfo.ResultCodeInfo;
import com.sugo.resident.commonapi.model.response.PageInfo;
import com.sugo.resident.commonapi.model.response.TableResponse;

import java.util.List;

public class PageUtils<T> {
	//返回分页错误消息
	public TableResponse<T> error(String code, String message){
		TableResponse<T> tableResult = new TableResponse<T>();
		tableResult.setCode(code);
		tableResult.setMsg(message);
		return tableResult;
	}
	
	//返回正确分页消息
	public TableResponse<T> right(List<T> list){
		TableResponse<T> tableResult = new TableResponse<T>();
		tableResult.setCode(ResultCodeInfo.SUCCESS.code());
		tableResult.setMsg(ResultCodeInfo.SUCCESS.message());
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
	public TableResponse<T> setPageInfo(int count, List<T> list){
		TableResponse<T> tableResult = new TableResponse<T>();
		PageInfo<T> pResult = new PageInfo<>();
		com.github.pagehelper.PageInfo<T> pageInfo = new com.github.pagehelper.PageInfo<>(list);
		pResult.setTotal(count);
		pResult.setData(list);
		tableResult.setData(pResult);
		tableResult.setMsg("交易处理成功");
		return tableResult;
	}
}
