package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.OmsOrderReturnReason;
import com.ns.service.OmsOrderReturnReasonService;
import com.ns.mapper.OmsOrderReturnReasonMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【oms_order_return_reason(退货原因)】的数据库操作Service实现
* @createDate 2023-07-18 19:57:14
*/
@Service
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonMapper, OmsOrderReturnReason>
implements OmsOrderReturnReasonService{

}
