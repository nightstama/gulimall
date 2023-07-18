package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.UmsIntegrationChangeHistory;
import com.ns.service.UmsIntegrationChangeHistoryService;
import com.ns.mapper.UmsIntegrationChangeHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【ums_integration_change_history(积分变化历史记录)】的数据库操作Service实现
* @createDate 2023-07-18 19:55:31
*/
@Service
public class UmsIntegrationChangeHistoryServiceImpl extends ServiceImpl<UmsIntegrationChangeHistoryMapper, UmsIntegrationChangeHistory>
implements UmsIntegrationChangeHistoryService{

}
