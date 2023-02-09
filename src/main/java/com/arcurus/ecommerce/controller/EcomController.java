//package com.arcurus.ecommerce.controller;
//
//import com.arcurus.ecommerce.configuration.JwtRequest;
//import com.arcurus.ecommerce.configuration.JwtResponse;
//import com.arcurus.ecommerce.configuration.JwtService;
//import com.arcurus.ecommerce.service.EcomService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.PostConstruct;
//
//@RestController
//@CrossOrigin
//@RequiredArgsConstructor
//public class EcomController {
//    private final EcomService ecomService;
//    private final JwtService jwtService;
//
//    @PostConstruct
//    public void initRoles() {
//        ecomService.initRoleAndUser();
//    }
//
//    @PostMapping("/authenticate")
//    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
//        return jwtService.createJwtToken(jwtRequest);
//    }
//
//    @GetMapping("/forAdmin")
//    @PreAuthorize("hasRole('Admin')")
//
//        public String forAdmin(){
//        return "this url is only accessible by admin";
//        }
//        @GetMapping("/forUser")
//        @PreAuthorize("hasRole('User')")
//    public String forUser(){
//        return  "this url is only accesible by the user";
//    }
//
//
//}
