package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsSkuLadder;
import com.ns.service.SmsSkuLadderService;
import com.ns.mapper.SmsSkuLadderMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_sku_ladder(商品阶梯价格)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:06
*/
@Service
public class SmsSkuLadderServiceImpl extends ServiceImpl<SmsSkuLadderMapper, SmsSkuLadder>
implements SmsSkuLadderService{

}
