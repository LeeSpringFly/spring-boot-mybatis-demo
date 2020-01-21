package com.lee.springbootmybatisdemo.pojo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class City {
    private long id;
    private String name;
    private String state;
}
