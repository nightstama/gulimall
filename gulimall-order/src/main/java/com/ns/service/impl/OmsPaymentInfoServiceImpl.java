package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.OmsPaymentInfo;
import com.ns.service.OmsPaymentInfoService;
import com.ns.mapper.OmsPaymentInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【oms_payment_info(支付信息表)】的数据库操作Service实现
* @createDate 2023-07-18 19:57:14
*/
@Service
public class OmsPaymentInfoServiceImpl extends ServiceImpl<OmsPaymentInfoMapper, OmsPaymentInfo>
implements OmsPaymentInfoService{

}
