package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsCoupon;
import com.ns.service.SmsCouponService;
import com.ns.mapper.SmsCouponMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_coupon(优惠券信息)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:05
*/
@Service
public class SmsCouponServiceImpl extends ServiceImpl<SmsCouponMapper, SmsCoupon>
implements SmsCouponService{

}
