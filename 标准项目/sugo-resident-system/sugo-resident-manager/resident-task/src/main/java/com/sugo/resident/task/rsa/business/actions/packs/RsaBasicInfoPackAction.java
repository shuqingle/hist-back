package com.sugo.resident.task.rsa.business.actions.packs;

import com.sugo.resident.commonapi.business.action.AbstractBusinessAction;
import com.sugo.resident.commonapi.business.base.BusinessBase;
import com.sugo.resident.commonapi.utils.DateUtils;
import com.sugo.resident.commonapi.utils.RSAUtils;
import com.sugo.resident.task.rsa.model.RsaDTO;
import org.apache.tomcat.util.codec.binary.Base64;

import java.security.KeyPair;


public class RsaBasicInfoPackAction extends AbstractBusinessAction<RsaDTO> {
    public RsaBasicInfoPackAction(BusinessBase<RsaDTO> busi) throws Exception {
        super(busi);
    }

    @Override
    protected void createAction() throws Exception {
        //获取密钥对
        KeyPair keyPair = RSAUtils.getKeyPair();
        //获取私钥
        String privateKey = new String(Base64.encodeBase64(keyPair.getPrivate().getEncoded()));
        //获取公钥
        String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));
        //设置基础信息
        this.busi.data().setPrivateKey(privateKey);
        this.busi.data().setPublicKey(publicKey);
        this.busi.data().setCreateDate(DateUtils.showToDayLenth8());
    }
}
