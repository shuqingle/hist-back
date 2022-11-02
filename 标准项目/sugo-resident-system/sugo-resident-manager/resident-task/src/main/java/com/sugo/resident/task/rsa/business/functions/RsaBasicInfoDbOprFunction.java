package com.sugo.resident.task.rsa.business.functions;

import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.business.function.AbstractBusinessFunction;
import com.sugo.resident.task.rsa.business.actions.dbase.RsaBasicInfoDeleteDbAction;
import com.sugo.resident.task.rsa.business.actions.dbase.RsaBasicInfoToDbAction;
import com.sugo.resident.task.rsa.model.RsaDTO;

public class RsaBasicInfoDbOprFunction extends AbstractBusinessFunction<RsaDTO> {
    public RsaBasicInfoDbOprFunction(BusinessBase<RsaDTO> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createFunction() throws Exception {
        //删除数据库中当前日期的rsa信息
        this.busi = new RsaBasicInfoDeleteDbAction(this.busi);
        //插入rsa信息到数据库
        this.busi = new RsaBasicInfoToDbAction(this.busi);
    }
}
