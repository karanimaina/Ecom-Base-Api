//package com.arcurus.ecommerce.model;
//
//
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.Set;
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//public class AppUser {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//    private  String username;
//    private String userFirstName;
//    private String userLastName;
//    private String userPassword;
//    @ManyToMany
//    @JoinTable(name = "USER_ROLE",
//                joinColumns =  {
//            @JoinColumn(name = "USER_ID")
//                },inverseJoinColumns ={
//            @JoinColumn(name = "ROLE_ID")
//    })
//    private Set<Role>role;
//}
