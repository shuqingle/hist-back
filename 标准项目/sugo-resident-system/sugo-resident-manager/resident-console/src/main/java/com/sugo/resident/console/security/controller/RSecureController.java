package com.sugo.resident.console.security.controller;

import com.sugo.resident.commonapi.annotation.WebLog;
import com.sugo.resident.commonapi.model.response.ObjectResponse;
import com.sugo.resident.commonapi.utils.ResponseUtils;
import com.sugo.resident.console.ruser.model.UserInfoDto;
import com.sugo.resident.console.ruser.model.UserInfoVO;
import com.sugo.resident.console.ruser.service.RUserService;
import com.sugo.resident.console.security.model.RsaDTO;
import com.sugo.resident.console.security.service.RSecureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class RSecureController {
    @Autowired
    RSecureService rSecureService;

    @RequestMapping("/console/secure/getPublicRsaKey")
    @ResponseBody
    @WebLog(description = "获取RSA公钥接口")
    public ObjectResponse<String> getPublicRsaKey(@RequestBody RsaDTO rsaDTO) throws Exception {
        return ResponseUtils.objectSuccess(rSecureService.getPublicRsaKey(rsaDTO));
    }
}
