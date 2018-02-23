package com.leon.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by leon on 2018/2/23.
 */
public class TestSelect {
    public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "sqlConfig.xml";
        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        Reader reader = Resources.getResourceAsReader(resource);
        //构建sqlSession的工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String statement = "com.leon.mybatis.userMapper.getUser";//映射sql的标识字符串
        String statementAll = "com.leon.mybatis.userMapper.getAll";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        User user = sqlSession.selectOne(statement, 1);
        List<User> users = sqlSession.selectList(statementAll);
        System.out.println(user);
        for (User user1 :
                users) {
            System.out.println(user1);
        }
    }
}
