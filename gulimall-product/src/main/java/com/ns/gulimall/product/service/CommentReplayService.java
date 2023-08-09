package com.ns.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ns.common.utils.PageUtils;
import com.ns.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author fankx
 * @email sunlightcs@gmail.com
 * @date 2023-07-19 11:12:41
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

