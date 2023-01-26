package com.gradproject.pathforward.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gradproject.pathforward.entity.User;
import com.gradproject.pathforward.repository.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }
  
  public User getUser(Long id) {
    return userRepository.findById(id).orElseThrow(RuntimeException::new);
  }

}
