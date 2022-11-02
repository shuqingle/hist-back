package com.sugo.resident.task.rsa.business.process;

import com.sugo.resident.commonapi.business.process.AbstractBusinessProcess;
import com.sugo.resident.task.rsa.business.actions.packs.RsaBasicInfoPackAction;
import com.sugo.resident.task.rsa.business.actions.redis.RsaBasicInfoToRedisAction;
import com.sugo.resident.task.rsa.business.functions.RsaBasicInfoDbOprFunction;
import com.sugo.resident.task.rsa.model.RsaDTO;

public class RsaKeyPairCreateProcess extends AbstractBusinessProcess<RsaDTO> {

    public RsaKeyPairCreateProcess(RsaDTO o) throws Exception {
        super(o);
    }

    @Override
    protected void createProcess() throws Exception {
        //生成封装rsa基础信息：密钥对及创建日期
        this.busi = new RsaBasicInfoPackAction(this.busi);
        //rsa信息数据库操作
        this.busi = new RsaBasicInfoDbOprFunction(this.busi);
        //rsa信息redis操作
        this.busi = new RsaBasicInfoToRedisAction(this.busi);

    }
}
