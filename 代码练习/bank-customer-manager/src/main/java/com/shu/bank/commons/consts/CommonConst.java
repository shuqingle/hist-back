package com.shu.bank.commons.consts;

public class CommonConst {
	//接口调用成功码值
	public static final String SUCCESS = "000000";
	public static final String YXJX_ERROR = "000001";
	
	//业务常量
	public static final String DELETE_FALSE = "00";
	public static final String DELETE_TRUE = "01";
	
	//当前操作人（登录人）currentOpenId
	public static final String CURRENT_LOGIN_USER_NO_ID = "currentOpenId";
	
	//批量插入/更新常量
	public static final int batchNum = 1000;
	
	
	/**
	 * 未生效-未完成-未完成
	 * 未生效-已完成-已完成
	 * 生效-未完成-未完成
	 * 生效-已完成-已完成
	 * 失效-未完成-已过期
	 * 失效-已完成-已完成
	 * 已经过期的任务不允许再进行完成？
	 */
	
	//任务状态-未生效
	public static final String UN_EFF = "01";
	
	//任务状态-已生效
	public static final String EFF = "02";
	
	//任务状态-已失效
	public static final String INVALID = "03";
	
	//任务成员任务完成情况-未完成
	public static final String UN_DO = "00";
	
	//任务成员任务完成情况-已完成
	public static final String DONE = "01";
	
	//操作类型-新增
	public static final String OPER_ADD = "00";
	
	//操作类型-修改
	public static final String OPER_UPDATE = "01";
	//查询类型：01-任务总数，02-已完成，03-未完成，04-即将超期，05-已经超期
	//查询类型
	public static final String QUERY_TYPE_ALL = "01";
	public static final String QUERY_TYPE_DONE = "02";
	public static final String QUERY_TYPE_UNDO = "03";
	public static final String QUERY_TYPE_WILL_EXPIRE = "04";
	public static final String QUERY_TYPE_EXPIRE = "05";
	
	
}
