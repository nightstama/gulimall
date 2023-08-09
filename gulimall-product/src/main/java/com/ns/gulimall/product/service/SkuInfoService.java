package com.ns.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ns.common.utils.PageUtils;
import com.ns.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author fankx
 * @email sunlightcs@gmail.com
 * @date 2023-07-19 11:12:41
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

