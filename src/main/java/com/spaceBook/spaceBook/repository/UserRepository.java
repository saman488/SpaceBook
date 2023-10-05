package com.spaceBook.spaceBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spaceBook.spaceBook.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
