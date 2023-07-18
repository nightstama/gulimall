package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsMemberPrice;
import com.ns.service.SmsMemberPriceService;
import com.ns.mapper.SmsMemberPriceMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_member_price(商品会员价格)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:06
*/
@Service
public class SmsMemberPriceServiceImpl extends ServiceImpl<SmsMemberPriceMapper, SmsMemberPrice>
implements SmsMemberPriceService{

}
