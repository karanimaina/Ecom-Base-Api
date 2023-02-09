package com.arcurus.ecommerce.service;


import com.arcurus.ecommerce.model.AppUser;
import com.arcurus.ecommerce.model.Role;
import com.arcurus.ecommerce.repository.RoleRepository;
import com.arcurus.ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class EcomService {
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;
    public final UserRepository userRepository;

    public Role createNewRole(Role role){
        roleRepository.save(role);
        return  role;
    }
    public AppUser createAppUser(AppUser appUser){
        return userRepository.save(appUser);
    }
    public void initRoleAndUser(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin Role");
        roleRepository.saveAndFlush(adminRole);

        AppUser adminUser = new AppUser();
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setUsername("admin123");
        adminUser.setUserPassword(passwordEncoder.encode("admin@pass"));
        Set<Role>adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userRepository.save(adminUser);

        AppUser user = new AppUser();
        user.setUserFirstName("raj");
        user.setUserLastName("sharma");
        user.setUsername("raj123");
        user.setUserPassword(passwordEncoder.encode("raj@pass"));
        Set<Role>userRoles = new HashSet<>();
        userRoles.add(adminRole);
        user.setRole(userRoles);
        userRepository.save(user);
    }
}
