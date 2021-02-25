package org.zerock.mapper;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import java.util.List;

public interface ReplyMapper {
    int insert(ReplyVO vo);
    ReplyVO read(Long rno);
    int delete(Long rno);
    int update(ReplyVO reply);
    List<ReplyVO> getListWithPaging(
            @Param("cri") Criteria cri,
            @Param("bno") Long bno
    );
}
