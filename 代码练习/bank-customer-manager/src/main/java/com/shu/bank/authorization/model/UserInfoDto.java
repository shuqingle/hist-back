package com.shu.bank.authorization.model;

import lombok.Data;

@Data
public class UserInfoDto {

    /////////////请求参数////////////
    private String tellerNo;
    private String tellerName;
    private String instNo;
    private String tellerStatus;
    private String passWord;
    private String tellerAddress;
    private String tellerAttr;
    private String delFla;

    /////////////过渡变量////////////
    private UserInfoVO userInfoVO;


}
