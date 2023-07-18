package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.PmsAttr;
import com.ns.service.PmsAttrService;
import com.ns.mapper.PmsAttrMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【pms_attr(商品属性)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:35
*/
@Service
public class PmsAttrServiceImpl extends ServiceImpl<PmsAttrMapper, PmsAttr>
implements PmsAttrService{

}
