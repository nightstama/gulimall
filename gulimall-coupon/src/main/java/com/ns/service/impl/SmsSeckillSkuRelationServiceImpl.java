package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsSeckillSkuRelation;
import com.ns.service.SmsSeckillSkuRelationService;
import com.ns.mapper.SmsSeckillSkuRelationMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_seckill_sku_relation(秒杀活动商品关联)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:06
*/
@Service
public class SmsSeckillSkuRelationServiceImpl extends ServiceImpl<SmsSeckillSkuRelationMapper, SmsSeckillSkuRelation>
implements SmsSeckillSkuRelationService{

}
