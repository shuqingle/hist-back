package com.sugo.resident.commonapi.business.annot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义自动注入注解
 * 在busi对象中可使用BusiAutoWired注解替换AutoWired注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.PARAMETER})
public @interface BusiAutoWired {
}
