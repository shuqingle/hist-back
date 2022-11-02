package com.sugo.resident.task.rsa.business.actions.redis;

import com.sugo.resident.commonapi.business.action.AbstractBusinessAction;
import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.business.utils.SpringContextUtil;
import com.sugo.resident.commonapi.utils.RedisUtil;
import com.sugo.resident.task.rsa.model.RsaDTO;

public class RsaBasicInfoToRedisAction extends AbstractBusinessAction<RsaDTO> {
//    @BusiAutoWired
    private RedisUtil redisUtil = SpringContextUtil.getBean(RedisUtil.class);

    public RsaBasicInfoToRedisAction(BusinessBase<RsaDTO> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        String dateStr = this.data().getCreateDate();
        //清除旧key
        if(redisUtil.hasKey("public-"+dateStr)){
            redisUtil.del("public-"+dateStr);
        }
        if(redisUtil.hasKey("private-"+dateStr)){
            redisUtil.del("private-"+dateStr);
        }
        //增加新key
        redisUtil.set("public-"+dateStr,this.busi.data().getPublicKey());
        redisUtil.set("private-"+dateStr,this.busi.data().getPrivateKey());
    }
}
