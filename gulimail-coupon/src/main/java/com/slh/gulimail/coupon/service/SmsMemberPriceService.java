package com.slh.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slh.common.utils.PageUtils;
import com.slh.gulimail.coupon.entity.SmsMemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-17 10:41:22
 */
public interface SmsMemberPriceService extends IService<SmsMemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

