package com.ns.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ns.common.utils.PageUtils;
import com.ns.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author fankx
 * @email sunlightcs@gmail.com
 * @date 2023-07-19 11:12:41
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

