package com.leon.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 2018/2/23.
 */
public class TestDelete {
    public static void main(String[] args) {
        try {
            String resource = "sqlConfig.xml";
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            String insertState = "com.leon.mybatis.userMapper.deleteById";
            String deleteArray = "com.leon.mybatis.userMapper.deleteArray";
            String deleteList = "com.leon.mybatis.userMapper.deleteList";
            String deleteMap = "com.leon.mybatis.userMapper.deleteMap";

//            sqlSession.delete(insertState, 1);
//            sqlSession.delete(deleteArray,new Integer[]{2,3});

//            List<Integer> idList = new ArrayList<Integer>();
//            idList.add(5);
//            idList.add(6);
//            sqlSession.delete(deleteList,idList);
            Map<String, Object> map = new HashMap<String, Object>();
            /**
             * 在通过以下两条语句测试本方法时，实际上仅删除了 id = 2,3,4 中 age = 18 的记录
             */
            map.put("ids", new Integer[]{2, 3, 4});
            map.put("age", 28);
            System.out.println(map.get("ids"));
            sqlSession.delete(deleteMap, map);
            sqlSession.commit();//默认是不自动提交，必须手工提交
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
