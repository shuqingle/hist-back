package com.shu.bank.authorization.model;

import lombok.Data;

@Data
public class UserInfoVO {
    private String tellerNo;
    private String tellerName;
    private String instNo;
    private String tellerStatus;
    private String passWord;
    private String tellerAddress;
    private String tellerAttr;
    private String delFla;
}
