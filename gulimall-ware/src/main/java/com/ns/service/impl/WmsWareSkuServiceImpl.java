package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.WmsWareSku;
import com.ns.service.WmsWareSkuService;
import com.ns.mapper.WmsWareSkuMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【wms_ware_sku(商品库存)】的数据库操作Service实现
* @createDate 2023-07-18 19:54:53
*/
@Service
public class WmsWareSkuServiceImpl extends ServiceImpl<WmsWareSkuMapper, WmsWareSku>
implements WmsWareSkuService{

}
