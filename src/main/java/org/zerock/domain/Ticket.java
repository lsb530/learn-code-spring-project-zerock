package org.zerock.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Ticket {
    private int tno;
    private String owner;
    private String grade;
}
