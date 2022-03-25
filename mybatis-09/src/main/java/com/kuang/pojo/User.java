package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//二级缓存读取数据需要序列化
public class User implements Serializable {
    private int id;
    private String name;
    private String pwd;
}
