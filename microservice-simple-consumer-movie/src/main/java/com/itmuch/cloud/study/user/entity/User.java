package com.itmuch.cloud.study.user.entity;

/**
 * <pre>
 * @PackageName com.itmuch.cloud.study.user.entity
 * @ClassName User
 * @Desc
 * @WebSite https://www.potato369.com
 * @Author Jack
 * @Date 2019/7/29 11:55
 * @CreateBy IntellJ IDEA 2019.1.1
 * @Copyright Copyright (c) 2016 ~ 2020 版权所有 (C) 土豆互联科技(深圳)有限公司 https://www.potato369.com All Rights Reserved。
 * </pre>
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data
//@NoArgsConstructor
public class User implements Serializable {

    private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
