package com.sugo.resident.commonapi.model.auth;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginUserInfo {
    private String tellerName;
    private String tellerNo;
    private String tellerIp;
    private String tellerPwd;
    private String tellerIdCard;
    private String tellerPhone;
}
