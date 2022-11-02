package com.sugo.resident.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//微服务必须扫描到commonApi的模块路径，否则无法获取对应的bean
@SpringBootApplication(scanBasePackages = {"com.sugo.resident.console","com.sugo.resident.commonapi"})
//@MapperScan("com.sugo.resident.console.ruser.dao")
public class ResidentConsoleApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ResidentConsoleApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ResidentConsoleApplication.class);
    }
}
