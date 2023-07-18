package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsCouponHistory;
import com.ns.service.SmsCouponHistoryService;
import com.ns.mapper.SmsCouponHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_coupon_history(优惠券领取历史记录)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:05
*/
@Service
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryMapper, SmsCouponHistory>
implements SmsCouponHistoryService{

}
