package com.slh.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slh.common.utils.PageUtils;
import com.slh.gulimail.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-16 23:01:01
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

