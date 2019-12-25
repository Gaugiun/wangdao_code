package com.cskaoyan.springboot_transaction.service;

import com.cskaoyan.springboot_transaction.mapper.TransactionMapperImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@ConfigurationProperties(prefix = "server")
public class TransactionServiceImp implements TransactionService {
    @Autowired
    TransactionMapperImp transactionMapper;

    @Override
    @Transactional
    public void changeAmount(Integer wage, String name1, String name2) {
        transactionMapper.updateAmount(wage, name1);
//        int i = 1/0;
        transactionMapper.updateAmount(-wage, name2);
    }
}
