package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.WmsWareOrderTaskDetail;
import com.ns.service.WmsWareOrderTaskDetailService;
import com.ns.mapper.WmsWareOrderTaskDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【wms_ware_order_task_detail(库存工作单)】的数据库操作Service实现
* @createDate 2023-07-18 19:54:53
*/
@Service
public class WmsWareOrderTaskDetailServiceImpl extends ServiceImpl<WmsWareOrderTaskDetailMapper, WmsWareOrderTaskDetail>
implements WmsWareOrderTaskDetailService{

}
