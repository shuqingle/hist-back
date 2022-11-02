package com.sugo.resident.task.rsa.controller;

import com.sugo.resident.commonapi.annotation.WebLog;
import com.sugo.resident.task.rsa.model.RsaDTO;
import com.sugo.resident.task.rsa.service.RRsaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AutoTaskController {
    @Autowired
    RRsaService rRsaService;

    /**
     * 每月1号凌晨1点执行一次自动生成公私钥，并持久化到数据库，并缓存到redis中
     */
    @Scheduled(cron = "0 0 1 1 * ?")
    @WebLog(description = "定时生成RSA密钥对接口")
    public void createRsaKeyPairs() throws Exception {
        rRsaService.createRsaKeyPairs(new RsaDTO());
    }
}
