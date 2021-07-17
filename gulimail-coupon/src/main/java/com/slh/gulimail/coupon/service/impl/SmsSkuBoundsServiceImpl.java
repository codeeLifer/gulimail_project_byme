package com.slh.gulimail.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.slh.common.utils.PageUtils;
import com.slh.common.utils.Query;

import com.slh.gulimail.coupon.dao.SmsSkuBoundsDao;
import com.slh.gulimail.coupon.entity.SmsSkuBoundsEntity;
import com.slh.gulimail.coupon.service.SmsSkuBoundsService;


@Service("smsSkuBoundsService")
public class SmsSkuBoundsServiceImpl extends ServiceImpl<SmsSkuBoundsDao, SmsSkuBoundsEntity> implements SmsSkuBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSkuBoundsEntity> page = this.page(
                new Query<SmsSkuBoundsEntity>().getPage(params),
                new QueryWrapper<SmsSkuBoundsEntity>()
        );

        return new PageUtils(page);
    }

}