package com.arcurus.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;



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
