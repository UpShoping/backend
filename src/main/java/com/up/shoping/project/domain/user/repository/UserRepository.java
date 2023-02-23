package com.up.shoping.project.domain.user.repository;

import com.up.shoping.project.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
