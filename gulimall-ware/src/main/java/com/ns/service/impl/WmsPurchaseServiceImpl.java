package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.WmsPurchase;
import com.ns.service.WmsPurchaseService;
import com.ns.mapper.WmsPurchaseMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【wms_purchase(采购信息)】的数据库操作Service实现
* @createDate 2023-07-18 19:54:53
*/
@Service
public class WmsPurchaseServiceImpl extends ServiceImpl<WmsPurchaseMapper, WmsPurchase>
implements WmsPurchaseService{

}
