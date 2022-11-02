package com.sugo.resident.commonapi.business.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 获得注入到spring容器中对象工具类
 */
@Configuration
public class SpringContextUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;


    @Bean
    public SpringContextUtil setBean(){
        return new SpringContextUtil();
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public static <T> T getBean(Class<T> clazz){
        checkApplicationContext();
        return applicationContext.getBean(clazz);
    }

    private static void checkApplicationContext() {
        if(applicationContext == null){
            throw new IllegalStateException("Spring容器未注入，请联系系统管理员");
        }
    }

}
