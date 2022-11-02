package com.sugo.resident.commonapi.utils;

import com.sugo.resident.commonapi.enumInfo.ResultCodeInfo;
import com.sugo.resident.commonapi.enumInfo.ResultCodeInterface;
import com.sugo.resident.commonapi.model.response.ObjectResponse;
import com.sugo.resident.commonapi.model.response.TableResponse;

import java.util.List;

public class ResponseUtils {
    public static <T> ObjectResponse<T> objectSuccess(){
        return new ObjectResponse(ResultCodeInfo.SUCCESS.code(),ResultCodeInfo.SUCCESS.message());
    }

    public static <T> ObjectResponse<T> objectSuccess(T data){
        return new ObjectResponse(ResultCodeInfo.SUCCESS.code(),ResultCodeInfo.SUCCESS.message(),data);
    }

    public static <T> TableResponse<T> tableSuccess(ResultCodeInterface errorCodes, List<T> list){
        PageUtils<T> pu = new PageUtils<>();
        return pu.right(list);
    }
}
