package com.sugo.resident.console.security.business.actions.redis;

import com.sugo.resident.commonapi.business.action.AbstractBusinessAction;
import com.sugo.resident.commonapi.business.annot.BusiAutoWired;
import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.utils.DateUtils;
import com.sugo.resident.commonapi.utils.RedisUtil;
import com.sugo.resident.console.security.model.RsaDTO;

public class RsaPublicFromRedisAction extends AbstractBusinessAction<RsaDTO> {
    @BusiAutoWired
    public static RedisUtil redisUtil;

    public RsaPublicFromRedisAction(BusinessBase<RsaDTO> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        String publicKey = (String) redisUtil.get("public-"+DateUtils.showToDayLenth8());
        this.data().setPublicKey(publicKey);
    }
}
