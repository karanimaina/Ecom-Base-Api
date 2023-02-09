//package com.arcurus.ecommerce.configuration;
//
//import com.arcurus.ecommerce.model.AppUser;
//import com.arcurus.ecommerce.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.DisabledException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//@RequiredArgsConstructor
//public class JwtService implements UserDetailsService {
//    private final UserRepository userRepository;
//    private final JwtUtil jwtUtil;
//    @Autowired
//    @Lazy
//    private final AuthenticationManager authenticationManager;
//    public JwtResponse createJwtToken(JwtRequest jwtRequest)throws  Exception{
//        String username = jwtRequest.getUsername();
//        String userPassword = jwtRequest.getUsernamePassword();
//        authenticate(username,userPassword);
//        final UserDetails userDetails = loadUserByUsername(username);
//        String token = jwtUtil.generateToken(userDetails);
//       AppUser appUser = userRepository.findByUsername(username);
//       return  new JwtResponse(appUser,token);
//
//    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        AppUser user= userRepository.findByUsername(username);
//
//        if (user!= null){
//            return new User(user.getUsername(),user.getUserPassword(),getAuthorities(user));
//        }else{
//   throw  new UsernameNotFoundException("username is not valid");
//        }
//    }
//    private Set getAuthorities(AppUser user){
//        Set authorities = new HashSet<>();
//        user.getRole().forEach(role -> {
//            authorities.add(new SimpleGrantedAuthority("ROLE" +role.getRoleName()));
//        });
//        return  authorities;
//    }
//    private void authenticate (String username, String userPasword) throws Exception{
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,userPasword));
//        }catch (DisabledException e){
//            throw  new Exception("User is disabled");
//        }catch (BadCredentialsException e){
//            throw  new Exception("Bad credentials from user");
//        }
//    }
//}
