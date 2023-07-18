package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.PmsBrand;
import com.ns.service.PmsBrandService;
import com.ns.mapper.PmsBrandMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【pms_brand(品牌)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:35
*/
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand>
implements PmsBrandService{

}
