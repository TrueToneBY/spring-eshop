package com.pavel.springeshop.dao;

import com.pavel.springeshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User,Long> {
    User findFirstByName(String name);
}
