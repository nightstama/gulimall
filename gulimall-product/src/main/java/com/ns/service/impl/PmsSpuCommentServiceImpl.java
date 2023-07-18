package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.PmsSpuComment;
import com.ns.service.PmsSpuCommentService;
import com.ns.mapper.PmsSpuCommentMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【pms_spu_comment(商品评价)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:36
*/
@Service
public class PmsSpuCommentServiceImpl extends ServiceImpl<PmsSpuCommentMapper, PmsSpuComment>
implements PmsSpuCommentService{

}
