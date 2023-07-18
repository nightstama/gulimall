package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.UmsMemberReceiveAddress;
import com.ns.service.UmsMemberReceiveAddressService;
import com.ns.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【ums_member_receive_address(会员收货地址)】的数据库操作Service实现
* @createDate 2023-07-18 19:55:32
*/
@Service
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressMapper, UmsMemberReceiveAddress>
implements UmsMemberReceiveAddressService{

}
