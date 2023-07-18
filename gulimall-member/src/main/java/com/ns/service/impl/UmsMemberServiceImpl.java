package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.UmsMember;
import com.ns.service.UmsMemberService;
import com.ns.mapper.UmsMemberMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【ums_member(会员)】的数据库操作Service实现
* @createDate 2023-07-18 19:55:31
*/
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember>
implements UmsMemberService{

}
