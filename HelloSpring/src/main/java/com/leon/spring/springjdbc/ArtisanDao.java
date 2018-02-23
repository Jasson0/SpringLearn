package com.leon.spring.springjdbc;

/**
 * Created by leon on 2018/2/12.
 */
public class ArtisanDao extends BaseDao {
    private static final String sql = "insert into artisan_user(user_name,password) values(?,?)";

    /**
     * @param artisan
     * @Title: addSingleArtisan
     * @Description: 增加一个Artisan
     * @return: void
     */
//    public void addSingleArtisan(Artisan artisan) {
//        jdbcTemplate.update(sql, artisan.getUserName(), artisan.getPassword());
//        System.out.println("insert successfully");
//    }
}
