package com.slh.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slh.common.utils.PageUtils;
import com.slh.gulimail.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-16 23:01:01
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

