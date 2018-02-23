package com.leon.mybatis;

import java.util.List;

/**
 * Created by leon on 2018/2/23.
 */
public class Customer {
    private List<Orders> orders;    // 关联多个订单
    private Integer id;
    private String name;

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orders=" + orders +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
