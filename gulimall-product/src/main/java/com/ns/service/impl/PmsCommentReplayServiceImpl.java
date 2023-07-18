package com.ns.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ns.domain.PmsCommentReplay;
import com.ns.service.PmsCommentReplayService;
import com.ns.mapper.PmsCommentReplayMapper;
import org.springframework.stereotype.Service;

/**
* @author fankx
* @description 针对表【pms_comment_replay(商品评价回复关系)】的数据库操作Service实现
* @createDate 2023-07-18 19:56:35
*/
@Service
public class PmsCommentReplayServiceImpl extends ServiceImpl<PmsCommentReplayMapper, PmsCommentReplay>
implements PmsCommentReplayService{

}
