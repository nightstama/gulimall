package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.OmsOrder;
import com.ns.service.OmsOrderService;
import com.ns.mapper.OmsOrderMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【oms_order(订单)】的数据库操作Service实现
* @createDate 2023-07-18 19:57:14
*/
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder>
implements OmsOrderService{

}
