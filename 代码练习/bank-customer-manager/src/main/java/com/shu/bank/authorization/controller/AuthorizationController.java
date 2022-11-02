package com.shu.bank.authorization.controller;

import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.authorization.model.UserInfoVO;
import com.shu.bank.authorization.service.AuthManageService;
import com.shu.bank.commons.annotation.WebLog;
import com.shu.bank.commons.enumInfo.ResultCodeInfo;
import com.shu.bank.commons.model.ObjectResp;
import com.shu.bank.commons.tools.ResponseTools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class AuthorizationController {
    @Autowired
    AuthManageService authManageService;
    /**
     * @param userInfoDto
     * 用户登录接口
     */
    @RequestMapping("/yxjx/yxjx/login")
    @ResponseBody
    @WebLog(description = "用户登录接口")
    public ObjectResp<UserInfoVO> login(@RequestBody UserInfoDto userInfoDto) throws Exception {
        return ResponseTools.objectSuccess(authManageService.login(userInfoDto));
    }
}
