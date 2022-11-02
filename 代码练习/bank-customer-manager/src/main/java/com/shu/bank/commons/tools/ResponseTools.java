package com.shu.bank.commons.tools;

import com.shu.bank.commons.enumInfo.ResultCodeInfo;
import com.shu.bank.commons.exception.ResultCodes;
import com.shu.bank.commons.model.ObjectResp;
import com.shu.bank.commons.model.TableResp;

import java.util.List;

public class ResponseTools {
    public static <T> ObjectResp<T> objectSuccess(){
        return new ObjectResp(ResultCodeInfo.SUCCESS.code(),ResultCodeInfo.SUCCESS.message());
    }

    public static <T> ObjectResp<T> objectSuccess(T data){
        return new ObjectResp(ResultCodeInfo.SUCCESS.code(),ResultCodeInfo.SUCCESS.message(),data);
    }

    public static <T>TableResp<T> tableSuccess(ResultCodes errorCodes, List<T> list){
        PageUtils<T> pu = new PageUtils<>();
        return pu.right(list);
    }
}
