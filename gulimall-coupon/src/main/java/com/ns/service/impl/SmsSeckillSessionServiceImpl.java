package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsSeckillSession;
import com.ns.service.SmsSeckillSessionService;
import com.ns.mapper.SmsSeckillSessionMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_seckill_session(秒杀活动场次)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:06
*/
@Service
public class SmsSeckillSessionServiceImpl extends ServiceImpl<SmsSeckillSessionMapper, SmsSeckillSession>
implements SmsSeckillSessionService{

}
