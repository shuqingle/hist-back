package com.sugo.resident.task.rsa.controller;

import com.sugo.resident.commonapi.annotation.WebLog;
import com.sugo.resident.commonapi.model.response.ObjectResponse;
import com.sugo.resident.commonapi.utils.ResponseUtils;
import com.sugo.resident.task.rsa.model.RsaDTO;
import com.sugo.resident.task.rsa.service.RRsaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HandTaskController {
    @Autowired
    RRsaService rRsaService;


    @RequestMapping("/task/handleTask")
    @ResponseBody
    @WebLog(description = "手动调用定时任务接口")
    public ObjectResponse<Object> handleTask(@RequestBody RsaDTO rsaDTO) throws Exception {
        if("01".equals(rsaDTO.getTaskFlag())){
            rRsaService.createRsaKeyPairs(rsaDTO);
        }
        return ResponseUtils.objectSuccess();
    }
}
