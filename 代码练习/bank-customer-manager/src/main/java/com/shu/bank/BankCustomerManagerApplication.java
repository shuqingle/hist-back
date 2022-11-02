package com.shu.bank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.shu.bank.authorization.dao")
public class BankCustomerManagerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BankCustomerManagerApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BankCustomerManagerApplication.class);
    }
}
