package com.itmuch.cloud.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class User implements Serializable {
	
	private transient static final long serialVersionUID = 8847910606632419540L;

	private Long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}
