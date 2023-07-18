package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.OmsOrderSetting;
import com.ns.service.OmsOrderSettingService;
import com.ns.mapper.OmsOrderSettingMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【oms_order_setting(订单配置信息)】的数据库操作Service实现
* @createDate 2023-07-18 19:57:14
*/
@Service
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingMapper, OmsOrderSetting>
implements OmsOrderSettingService{

}
