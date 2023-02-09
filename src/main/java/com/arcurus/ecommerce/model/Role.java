package com.arcurus.ecommerce.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Role {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private  long id;
    private String  roleName;
    private String roleDescription;
}
