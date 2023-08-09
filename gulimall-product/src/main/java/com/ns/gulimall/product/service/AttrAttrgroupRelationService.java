package com.ns.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ns.common.utils.PageUtils;
import com.ns.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author fankx
 * @email sunlightcs@gmail.com
 * @date 2023-07-19 11:12:40
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

