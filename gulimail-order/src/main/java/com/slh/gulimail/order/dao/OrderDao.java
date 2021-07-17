package com.slh.gulimail.order.dao;

import com.slh.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-07-16 23:01:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
