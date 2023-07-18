package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.UmsGrowthChangeHistory;
import com.ns.service.UmsGrowthChangeHistoryService;
import com.ns.mapper.UmsGrowthChangeHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【ums_growth_change_history(成长值变化历史记录)】的数据库操作Service实现
* @createDate 2023-07-18 19:55:31
*/
@Service
public class UmsGrowthChangeHistoryServiceImpl extends ServiceImpl<UmsGrowthChangeHistoryMapper, UmsGrowthChangeHistory>
implements UmsGrowthChangeHistoryService{

}
