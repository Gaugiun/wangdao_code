package com.cskaoyan.springboot_transaction;

import com.cskaoyan.springboot_transaction.controllor.TransactionControllor;
import com.cskaoyan.springboot_transaction.controllor.TransactionControllorImp;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@MapperScan(basePackages = "com.cskaoyan.springboot_transaction")
@SpringBootTest
class SpringbootTransactionApplicationTests {

    @Autowired
    TransactionControllorImp transactionControllor;

    @Test
    void contextLoads() {
        transactionControllor.changeAmount(2000, "exployee1", "boss1");
    }
}
