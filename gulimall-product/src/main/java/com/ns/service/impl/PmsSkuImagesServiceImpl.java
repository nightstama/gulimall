package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.PmsSkuImages;
import com.ns.service.PmsSkuImagesService;
import com.ns.mapper.PmsSkuImagesMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【pms_sku_images(sku图片)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:36
*/
@Service
public class PmsSkuImagesServiceImpl extends ServiceImpl<PmsSkuImagesMapper, PmsSkuImages>
implements PmsSkuImagesService{

}
