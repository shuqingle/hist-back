package com.shu.bank.commons.handler;

import com.shu.bank.authorization.model.UserInfoVO;
import com.shu.bank.commons.annotation.CurrentUser;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;

/**
 * CurrentUser注解实现类
 * @author lenovo
 *
 */
public class CurrentUserHandlerMethodArgReslover implements HandlerMethodArgumentResolver{
	
	/**
	    * 判断是否支持使用@CurrentUser注解的参数
	    */
	@Override
	public boolean supportsParameter(MethodParameter methodParameter) {
		//如果该参数注解有@CurrentUser且参数类型是User
        return methodParameter.getParameterAnnotation(CurrentUser.class) != null &&methodParameter.getParameterType() == UserInfoVO.class;
	}
	
	/**
	    * 注入参数值
	    */
	@Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        //取得HttpServletRequest
        HttpServletRequest request= (HttpServletRequest) nativeWebRequest.getNativeRequest();
        //取出session中的User
        return (UserInfoVO)request.getSession().getAttribute("currentUser");
    }

	

}
