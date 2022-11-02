package com.shu.bank.commons.tools;

import com.shu.bank.commons.exception.BusiException;
import com.shu.bank.commons.exception.ResultCodes;

/**
 * 通用工具类
 */
public class CommonTools {
    public static void stopBusiProcess(ResultCodes errorCodes) throws BusiException{
        throw new BusiException(errorCodes);
    }
}
