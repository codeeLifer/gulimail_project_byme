package com.slh.gulimail.order;

import com.slh.gulimail.order.dao.OrderDao;
import com.slh.gulimail.order.entity.OrderEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailOrderApplicationTests {

    @Autowired
    private OrderDao dao;
    @Test
    void contextLoads() {
        OrderEntity entity = new OrderEntity();
        entity.setBillContent("123132");
        entity.setBillHeader("get");
        entity.setMemberId(456l);
        dao.insert(entity);

    }

}
