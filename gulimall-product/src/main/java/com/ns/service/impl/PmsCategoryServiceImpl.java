package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.PmsCategory;
import com.ns.service.PmsCategoryService;
import com.ns.mapper.PmsCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【pms_category(商品三级分类)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:35
*/
@Service
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryMapper, PmsCategory>
implements PmsCategoryService{

}
