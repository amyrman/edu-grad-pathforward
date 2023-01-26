package com.gradproject.pathforward;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gradproject.pathforward.entity.User;
import com.gradproject.pathforward.repository.UserRepository;

@Configuration
public class ApplicationConfig {

  @Bean
  CommandLineRunner init(UserRepository userRepository) {
    return args -> {

      User user1 = new User();
      user1.setName("Leif Pagrotsky");
      user1.setEmail("leffe@hedonism.nu");
      userRepository.save(user1);

    };
  }
}
