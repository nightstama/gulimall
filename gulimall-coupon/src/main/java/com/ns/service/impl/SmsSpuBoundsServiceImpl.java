package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsSpuBounds;
import com.ns.service.SmsSpuBoundsService;
import com.ns.mapper.SmsSpuBoundsMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_spu_bounds(商品spu积分设置)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:06
*/
@Service
public class SmsSpuBoundsServiceImpl extends ServiceImpl<SmsSpuBoundsMapper, SmsSpuBounds>
implements SmsSpuBoundsService{

}
