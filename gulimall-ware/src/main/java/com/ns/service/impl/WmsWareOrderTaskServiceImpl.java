package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.WmsWareOrderTask;
import com.ns.service.WmsWareOrderTaskService;
import com.ns.mapper.WmsWareOrderTaskMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【wms_ware_order_task(库存工作单)】的数据库操作Service实现
* @createDate 2023-07-18 19:54:53
*/
@Service
public class WmsWareOrderTaskServiceImpl extends ServiceImpl<WmsWareOrderTaskMapper, WmsWareOrderTask>
implements WmsWareOrderTaskService{

}
