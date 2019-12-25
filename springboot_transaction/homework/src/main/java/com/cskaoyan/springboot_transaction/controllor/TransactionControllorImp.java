package com.cskaoyan.springboot_transaction.controllor;

import com.cskaoyan.springboot_transaction.service.TransactionService;
import com.cskaoyan.springboot_transaction.service.TransactionServiceImp;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class TransactionControllorImp implements TransactionControllor {
    @Autowired
    TransactionServiceImp transactionService;

    @Override
    public void changeAmount(Integer wage, String name1, String name2) {
        transactionService.changeAmount(wage, name1,name2);
    }
}
