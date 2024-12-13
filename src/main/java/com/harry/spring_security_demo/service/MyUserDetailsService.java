package com.harry.spring_security_demo.service;

import com.harry.spring_security_demo.Repo.userRepo;
import com.harry.spring_security_demo.model.User;
import com.harry.spring_security_demo.model.UserPrinceples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private userRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

      User user= repo.findByUsername(username);

        if(user==null)
        {
            System.out.println("User 404");
            throw new UsernameNotFoundException("User 404");
        }
        return new UserPrinceples(user);
    }
}
