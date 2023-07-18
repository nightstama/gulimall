package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.OmsOrderItem;
import com.ns.service.OmsOrderItemService;
import com.ns.mapper.OmsOrderItemMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【oms_order_item(订单项信息)】的数据库操作Service实现
* @createDate 2023-07-18 19:57:14
*/
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem>
implements OmsOrderItemService{

}
