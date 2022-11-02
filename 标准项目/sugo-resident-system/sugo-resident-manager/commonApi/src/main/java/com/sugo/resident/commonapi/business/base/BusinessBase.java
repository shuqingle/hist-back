package com.sugo.resident.commonapi.business.base;

/**
 * @see
 * @description 通用业务对象(使用装饰者模式装饰业务对象)
 */
public class BusinessBase<T> {
    protected BusinessBase<T> busi;

    public final void execute() throws Exception{
        if(this.busi != null){
            this.busi.execute();
        }
        core();
    }

    /**
     * 返回数据
     * @return
     */
    public T data(){
        return this.busi.data();
    }

    /**
     * 核心业务方法
     * @throws Exception
     */
    protected void core() throws Exception{}
}
