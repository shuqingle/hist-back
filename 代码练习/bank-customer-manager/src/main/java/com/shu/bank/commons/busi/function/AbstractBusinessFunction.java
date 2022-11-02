package com.shu.bank.commons.busi.function;


import com.shu.bank.commons.busi.base.BusiBase;

/**
 * @see
 * @description 包装请求DTO为BusiBase类型
 * @author shuqingle
 */
public abstract class AbstractBusinessFunction <T> extends BusiBase<T> {
    public AbstractBusinessFunction(BusiBase<T> busi) throws Exception{
        this.busi = busi;
        createFunction();
    }

    /**
     * 生成函数业务对象
     */
    protected abstract void createFunction() throws Exception;
}
