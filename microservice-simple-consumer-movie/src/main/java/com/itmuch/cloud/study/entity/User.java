package com.itmuch.cloud.study.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data(staticConstructor = "UserFactory")
@NoArgsConstructor
public class User{

	@JsonProperty(value = "id")
    private Long id;

	@JsonProperty(value = "username")
    private String username;

	@JsonProperty(value = "name")
    private String name;

	@JsonProperty(value = "age")
    private Integer age;

	@JsonProperty(value = "balance")
    private BigDecimal balance;
}
