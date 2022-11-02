package com.sugo.resident.commonapi.utils;

import com.sugo.resident.commonapi.enumInfo.ResultCodeInterface;
import com.sugo.resident.commonapi.exception.BusinessException;

import java.util.UUID;


/**
 * 通用工具类
 */
public class BusinessUtil {
    public static void stopBusiProcess(ResultCodeInterface errorCodes) throws BusinessException {
        throw new BusinessException(errorCodes);
    }

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replaceAll("-", "");
        return uuid;
    }

}
