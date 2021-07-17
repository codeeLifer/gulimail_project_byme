package com.slh.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slh.common.utils.PageUtils;
import com.slh.gulimail.coupon.entity.SmsSpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-17 10:41:22
 */
public interface SmsSpuBoundsService extends IService<SmsSpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

