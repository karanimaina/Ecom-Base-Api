package com.arcurus.ecommerce.repository;

import com.arcurus.ecommerce.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUsername(String username);



}
