package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.UmsMemberLoginLog;
import com.ns.service.UmsMemberLoginLogService;
import com.ns.mapper.UmsMemberLoginLogMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【ums_member_login_log(会员登录记录)】的数据库操作Service实现
* @createDate 2023-07-18 19:55:32
*/
@Service
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogMapper, UmsMemberLoginLog>
implements UmsMemberLoginLogService{

}
