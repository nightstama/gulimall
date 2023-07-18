package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsSeckillPromotion;
import com.ns.service.SmsSeckillPromotionService;
import com.ns.mapper.SmsSeckillPromotionMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_seckill_promotion(秒杀活动)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:06
*/
@Service
public class SmsSeckillPromotionServiceImpl extends ServiceImpl<SmsSeckillPromotionMapper, SmsSeckillPromotion>
implements SmsSeckillPromotionService{

}
