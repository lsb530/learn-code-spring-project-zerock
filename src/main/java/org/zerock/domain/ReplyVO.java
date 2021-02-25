package org.zerock.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class ReplyVO {
    private Long rno;
    private Long bno;
    private String reply;
    private String replyer;
    private Date replyDate;
    private Date updateDate;
}
