package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Je.vinci.Inc. on 2017. 4. 6..
 */
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUsername(String username);
}
