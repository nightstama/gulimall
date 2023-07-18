package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.WmsWareInfo;
import com.ns.service.WmsWareInfoService;
import com.ns.mapper.WmsWareInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【wms_ware_info(仓库信息)】的数据库操作Service实现
* @createDate 2023-07-18 19:54:53
*/
@Service
public class WmsWareInfoServiceImpl extends ServiceImpl<WmsWareInfoMapper, WmsWareInfo>
implements WmsWareInfoService{

}
