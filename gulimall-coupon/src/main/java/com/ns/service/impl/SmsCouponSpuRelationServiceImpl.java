package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsCouponSpuRelation;
import com.ns.service.SmsCouponSpuRelationService;
import com.ns.mapper.SmsCouponSpuRelationMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_coupon_spu_relation(优惠券与产品关联)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:05
*/
@Service
public class SmsCouponSpuRelationServiceImpl extends ServiceImpl<SmsCouponSpuRelationMapper, SmsCouponSpuRelation>
implements SmsCouponSpuRelationService{

}
