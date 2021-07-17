package com.slh.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slh.common.utils.PageUtils;
import com.slh.gulimail.coupon.entity.SmsCouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-17 10:41:22
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
