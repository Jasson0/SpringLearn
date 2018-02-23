package com.leon.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 2018/2/23.
 */
public class TestMap {
    public static void main(String[] args) {
        try {
            String resource = "sqlConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            String insertState = "com.leon.mybatis.customerMapper.find";
            Map map = new HashMap();
            map.put("customerName", "charlis");
            List<Customer> customerList  = sqlSession.selectList(insertState, map);
            for (Customer c : customerList) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
