package com.sugo.resident.task.rsa.service.impl;

import com.sugo.resident.commonapi.business.process.AbstractBusinessProcess;
import com.sugo.resident.task.rsa.business.process.RsaKeyPairCreateProcess;
import com.sugo.resident.task.rsa.dao.RRsaMapper;
import com.sugo.resident.task.rsa.model.RsaDTO;
import com.sugo.resident.task.rsa.service.RRsaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class RRsaServiceImpl implements RRsaService {
    @Override
    public void createRsaKeyPairs(RsaDTO rsaDTO) throws Exception {
        AbstractBusinessProcess process = new RsaKeyPairCreateProcess(rsaDTO);
        process.execute();
    }
}
