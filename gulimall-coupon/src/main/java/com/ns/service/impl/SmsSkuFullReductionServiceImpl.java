package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsSkuFullReduction;
import com.ns.service.SmsSkuFullReductionService;
import com.ns.mapper.SmsSkuFullReductionMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_sku_full_reduction(商品满减信息)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:06
*/
@Service
public class SmsSkuFullReductionServiceImpl extends ServiceImpl<SmsSkuFullReductionMapper, SmsSkuFullReduction>
implements SmsSkuFullReductionService{

}
