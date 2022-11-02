package com.sugo.resident.console.security.business.actions.dbase;

import com.sugo.resident.commonapi.business.action.AbstractBusinessAction;
import com.sugo.resident.commonapi.business.annot.BusiAutoWired;
import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.utils.BusinessUtil;
import com.sugo.resident.commonapi.utils.DateUtils;
import com.sugo.resident.console.security.business.enums.RsaResultCodeInfo;
import com.sugo.resident.console.security.dao.RRsaMapper;
import com.sugo.resident.console.security.model.RsaDTO;
import org.springframework.util.StringUtils;

public class RsaPublicFromDBAction extends AbstractBusinessAction<RsaDTO> {
    @BusiAutoWired
    public static RRsaMapper rsaMapper;

    public RsaPublicFromDBAction(BusinessBase<RsaDTO> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        this.data().setCreateDate(DateUtils.showToDayLenth8());
        RsaDTO result = rsaMapper.queryRsaInfo(this.data());
        if(null == result || StringUtils.isEmpty(result.getPublicKey())){
            BusinessUtil.stopBusiProcess(RsaResultCodeInfo.RSA_QUERY_ERROR);
        }
        this.data().setPublicKey(result.getPublicKey());
    }
}
