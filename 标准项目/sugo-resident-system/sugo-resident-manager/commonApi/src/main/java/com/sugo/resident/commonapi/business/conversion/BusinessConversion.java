package com.sugo.resident.commonapi.business.conversion;


import com.sugo.resident.commonapi.business.base.BusinessBase;

/**
 * @see
 * @description 包装请求DTO为BusiBase类型
 * @author shuqingle
 */
public class BusinessConversion <T> extends BusinessBase<T> {
    private T t;

    public BusinessConversion(T t) {
        this.t = t;
    }

    @Override
    public T data() {
        return this.t;
    }
}
