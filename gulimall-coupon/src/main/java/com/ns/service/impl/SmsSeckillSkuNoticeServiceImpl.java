package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsSeckillSkuNotice;
import com.ns.service.SmsSeckillSkuNoticeService;
import com.ns.mapper.SmsSeckillSkuNoticeMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_seckill_sku_notice(秒杀商品通知订阅)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:06
*/
@Service
public class SmsSeckillSkuNoticeServiceImpl extends ServiceImpl<SmsSeckillSkuNoticeMapper, SmsSeckillSkuNotice>
implements SmsSeckillSkuNoticeService{

}
