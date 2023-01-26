package com.gradproject.pathforward.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gradproject.pathforward.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
