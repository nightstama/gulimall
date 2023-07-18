package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.SmsHomeSubject;
import com.ns.service.SmsHomeSubjectService;
import com.ns.mapper.SmsHomeSubjectMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【sms_home_subject(首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:05
*/
@Service
public class SmsHomeSubjectServiceImpl extends ServiceImpl<SmsHomeSubjectMapper, SmsHomeSubject>
implements SmsHomeSubjectService{

}
