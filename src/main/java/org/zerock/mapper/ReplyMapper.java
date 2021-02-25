package org.zerock.mapper;

import org.zerock.domain.ReplyVO;

public interface ReplyMapper {
    int insert(ReplyVO vo);
    ReplyVO read(Long rno);
    int delete(Long rno);
    int update(ReplyVO reply);
}
