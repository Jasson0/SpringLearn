package com.leon.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by leon on 2018/2/23.
 */
public class TestInsert {
    public static void main(String[] args) {
        try {
            String resource = "sqlConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            String insertState = "com.leon.mybatis.userMapper.insertUser";
            User user = new User();
            user.setId(3);
            user.setName("leon");
            user.setAge(28);
            sqlSession.insert(insertState, user);
            sqlSession.commit();//默认是不自动提交，必须手工提交
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
