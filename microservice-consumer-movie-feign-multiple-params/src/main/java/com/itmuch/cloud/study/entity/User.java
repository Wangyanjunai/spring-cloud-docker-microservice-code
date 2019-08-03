package com.itmuch.cloud.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

@AllArgsConstructor
@Builder
@Data(staticConstructor = "UserFactory")
@NoArgsConstructor
public class User implements Serializable {

    private transient static final long serialVersionUID = 8847910606632419540L;

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
