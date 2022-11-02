package com.shu.bank.commons.interceptors;

import com.google.gson.Gson;
import com.shu.bank.authorization.dao.LoginUserMapper;
import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.authorization.model.UserInfoVO;
import com.shu.bank.commons.consts.CommonConst;
import com.shu.bank.commons.enumInfo.ResultCodeInfo;
import com.shu.bank.commons.model.ObjectResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
public class GlobalInterceptor implements HandlerInterceptor {
	private LoginUserMapper loginUserMapper;
	
	public GlobalInterceptor(LoginUserMapper loginUserMapper) {
		super();
		this.loginUserMapper = loginUserMapper;
	}
	//拦截并获取登录用户信息
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String currentOpenId = request.getHeader(CommonConst.CURRENT_LOGIN_USER_NO_ID);
		log.info("当前请求currentOpenId=====>"+currentOpenId);
		if(!StringUtils.isEmpty(currentOpenId)){
			UserInfoDto loginUserDto = new UserInfoDto();
			loginUserDto.setTellerNo(currentOpenId);
			//根据openId获取用户信息
			UserInfoVO userInfoVO = loginUserMapper.queryUserLoginInfo(loginUserDto);
			log.info("当前登录用户信息:"+ new Gson().toJson(userInfoVO));
			if(userInfoVO != null){
				request.getSession().setAttribute("currentUser",userInfoVO);
				return HandlerInterceptor.super.preHandle(request, response, handler);
			} 
		}
		 return returnErrorMsg(response);
	}

	private boolean returnErrorMsg(HttpServletResponse response) throws IOException {
		log.error(ResultCodeInfo.ILEGAL_USER_ERROR.getMsg());
		//重置response
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        //封装响应体
        PrintWriter pw = response.getWriter();
        ObjectResp<Object> resp = new ObjectResp<Object>();
        resp.setCodeMsg(ResultCodeInfo.ILEGAL_USER_ERROR);
        Object json = new Gson().toJson(resp);
        pw.write(json.toString());
		return false;
	}
	
}
