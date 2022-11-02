package com.sugo.resident.commonapi.business.function;


import com.sugo.resident.commonapi.business.base.BusinessBase;


/**
 * @see
 * @description 包装请求DTO为BusiBase类型
 * @author shuqingle
 */
public abstract class AbstractBusinessFunction <T> extends BusinessBase<T> {
    public AbstractBusinessFunction(BusinessBase<T> busi) throws Exception{
        this.busi = busi;
        createFunction();
    }

    /**
     * 生成函数业务对象
     */
    protected abstract void createFunction() throws Exception;
}
