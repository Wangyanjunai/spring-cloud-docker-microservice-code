package com.itmuch.cloud.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data(staticConstructor = "UserFactory")
@Entity
@NoArgsConstructor
public class User implements Serializable {

	@Transient
    private static final long serialVersionUID = 8847910606632419540L;

    @Id
    @Column(name = "id", nullable = false, length = 11)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty(value = "id")
    private Long id;

    @Column(name = "user_name", nullable = false, length = 64)
    @JsonProperty(value = "username")
    private String username;

    @Column(name = "name", nullable = true, length = 64)
    @JsonProperty(value = "name")
    private String name;

    @Column(name = "age", nullable = true, length = 3)
    @JsonProperty(value = "age")
    private Integer age;

    @Column(name = "balance", nullable = true, length = 12)
    @JsonProperty(value = "balance")
    private BigDecimal balance;
}
