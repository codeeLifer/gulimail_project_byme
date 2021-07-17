package com.slh.gulimail.product;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.slh.gulimail.product.dao.BrandDao;
import com.slh.gulimail.product.entity.BrandEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    private BrandDao bd;

    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setDescript("华为真棒");
        brand.setLogo("华为424222");
        brand.setBrandId(1l);

        bd.updateById(brand);
    }

}
