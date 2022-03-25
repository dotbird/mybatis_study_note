package com.kuang.pojo;

import lombok.*;
import org.apache.ibatis.type.Alias;

//使用注解起别名
@Alias("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {

    private int id;
    private String name;
    private String password;


}
