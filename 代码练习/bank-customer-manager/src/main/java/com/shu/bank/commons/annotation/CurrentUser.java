package com.shu.bank.commons.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解：通过该注解实现用户校验及获取用户信息
 * @author lenovo
 *
 */
//标注这个类它可以标注的位置
@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE,ElementType.PARAMETER})
//标注这个注解的注解保留时期
@Retention(RetentionPolicy.RUNTIME)
//是否生成注解文档
@Documented
public @interface CurrentUser {
	
}
