package com.arcurus.ecommerce.controller;

import com.arcurus.ecommerce.service.EcomService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EcomController {
    private  final EcomService ecomService;
    @PostConstruct
    public void initRoles(){
    ecomService.initRoleAndUser();
}

}
