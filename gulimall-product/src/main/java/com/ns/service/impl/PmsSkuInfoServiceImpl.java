package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.PmsSkuInfo;
import com.ns.service.PmsSkuInfoService;
import com.ns.mapper.PmsSkuInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【pms_sku_info(sku信息)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:36
*/
@Service
public class PmsSkuInfoServiceImpl extends ServiceImpl<PmsSkuInfoMapper, PmsSkuInfo>
implements PmsSkuInfoService{

}
