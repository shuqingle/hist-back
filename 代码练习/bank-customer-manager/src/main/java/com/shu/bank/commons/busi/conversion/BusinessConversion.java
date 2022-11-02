package com.shu.bank.commons.busi.conversion;

import com.shu.bank.commons.busi.base.BusiBase;

/**
 * @see
 * @description 包装请求DTO为BusiBase类型
 * @author shuqingle
 */
public class BusinessConversion <T> extends BusiBase<T> {
    private T t;

    public BusinessConversion(T t) {
        this.t = t;
    }

    @Override
    public T data() {
        return this.t;
    }
}
