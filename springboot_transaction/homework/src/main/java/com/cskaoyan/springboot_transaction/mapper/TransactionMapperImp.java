package com.cskaoyan.springboot_transaction.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

@ConfigurationProperties(prefix = "spring")
@Repository
public class TransactionMapperImp implements TransactionMapper {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public Integer updateAmount(Integer wage, String name) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TransactionMapper mapper = sqlSession.getMapper(TransactionMapper.class);
        Integer i = mapper.updateAmount(wage, name);
        return i;
    }
}
