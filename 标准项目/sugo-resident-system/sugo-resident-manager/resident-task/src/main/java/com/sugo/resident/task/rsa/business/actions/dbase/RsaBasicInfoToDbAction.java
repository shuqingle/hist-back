package com.sugo.resident.task.rsa.business.actions.dbase;

import com.sugo.resident.commonapi.business.action.AbstractBusinessAction;
import com.sugo.resident.commonapi.business.annot.BusiAutoWired;
import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.business.utils.SpringContextUtil;
import com.sugo.resident.task.rsa.dao.RRsaMapper;
import com.sugo.resident.task.rsa.model.RsaDTO;

public class RsaBasicInfoToDbAction extends AbstractBusinessAction<RsaDTO> {
    @BusiAutoWired
    public static RRsaMapper rsaMapper;

    public RsaBasicInfoToDbAction(BusinessBase<RsaDTO> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        rsaMapper.addRsa(this.busi.data());
    }
}
