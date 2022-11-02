package com.sugo.resident.console.security.business.process;

import com.sugo.resident.commonapi.business.process.AbstractBusinessProcess;
import com.sugo.resident.console.security.business.actions.dbase.RsaPublicFromDBAction;
import com.sugo.resident.console.security.business.actions.redis.RsaPublicFromRedisAction;
import com.sugo.resident.console.security.model.RsaDTO;

public class GetRsaPublicKeyProcess extends AbstractBusinessProcess<RsaDTO> {
    public GetRsaPublicKeyProcess(RsaDTO rsaDTO) throws Exception {
        super(rsaDTO);
    }

    @Override
    protected void createProcess() throws Exception {
        //从redis中获取公钥
        this.busi = new RsaPublicFromRedisAction(this.busi);
        //若redis不存在公钥则从数据库中获取公钥
        this.busi = new RsaPublicFromDBAction(this.busi);
    }
}
