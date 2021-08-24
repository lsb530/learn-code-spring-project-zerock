package org.codechobo.domain;

import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class User {
    String name;
    int age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birth;
}