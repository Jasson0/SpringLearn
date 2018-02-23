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
public class TestUpdate {
    public static void main(String[] args) {
        try {
            String resource = "sqlConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            String updateState = "com.leon.mybatis.userMapper.updateUser";
            String selectState = "com.leon.mybatis.userMapper.getUser";
            User user = sqlSession.selectOne(selectState, 3);
            user.setName("new leon");
            user.setAge(25);
            sqlSession.update(updateState, user);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
