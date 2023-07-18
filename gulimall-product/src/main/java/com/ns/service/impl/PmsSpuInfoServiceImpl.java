package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.PmsSpuInfo;
import com.ns.service.PmsSpuInfoService;
import com.ns.mapper.PmsSpuInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【pms_spu_info(spu信息)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:36
*/
@Service
public class PmsSpuInfoServiceImpl extends ServiceImpl<PmsSpuInfoMapper, PmsSpuInfo>
implements PmsSpuInfoService{

}
