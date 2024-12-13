package com.harry.spring_security_demo.Repo;

//import org.apache.catalina.User;
import com.harry.spring_security_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User,Integer> {

//    User findByUsername(String username);

    User findByUsername(String username);
}
