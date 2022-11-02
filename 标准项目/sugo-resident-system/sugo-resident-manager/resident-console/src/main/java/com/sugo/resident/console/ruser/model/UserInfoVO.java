package com.sugo.resident.console.ruser.model;

import lombok.Data;

@Data
public class UserInfoVO {
    private String tellerNo        ;
    private String tellerName      ;
    private String tellerIdcard;
    private String instSeqNo       ;
    private String phoneNo         ;
    private String tellerPassword  ;
    private String headPhonto      ;
    private String tellerStatus    ;
    private String token;
}
