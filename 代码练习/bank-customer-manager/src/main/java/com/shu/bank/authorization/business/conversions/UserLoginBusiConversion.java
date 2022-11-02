package com.shu.bank.authorization.business.conversions;

import com.shu.bank.authorization.model.UserInfoDto;
import com.shu.bank.commons.busi.conversion.BusinessConversion;

public class UserLoginBusiConversion extends BusinessConversion<UserInfoDto> {
    public UserLoginBusiConversion(UserInfoDto userInfoDto) {
        super(userInfoDto);
    }
}
