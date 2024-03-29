package com.itmuch.cloud.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data(staticConstructor = "UserFactory")
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
 
	@Transient
	private transient static final long serialVersionUID = 6376198967731549857L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@NonNull
    private Long id;

    @Column
    @NonNull
    private String username;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    @NonNull
    private BigDecimal balance;
}
