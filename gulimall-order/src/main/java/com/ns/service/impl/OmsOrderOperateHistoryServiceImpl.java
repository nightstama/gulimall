package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.OmsOrderOperateHistory;
import com.ns.service.OmsOrderOperateHistoryService;
import com.ns.mapper.OmsOrderOperateHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【oms_order_operate_history(订单操作历史记录)】的数据库操作Service实现
* @createDate 2023-07-18 19:57:14
*/
@Service
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryMapper, OmsOrderOperateHistory>
implements OmsOrderOperateHistoryService{

}
