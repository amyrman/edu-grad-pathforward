package com.gradproject.pathforward.controller;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import com.gradproject.pathforward.service.UserService;
import com.gradproject.pathforward.entity.User;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

  @Mock
  private UserService service;

  @InjectMocks
  private UserController controller;

  @BeforeEach
  void configureUserService() {
    User u1 = new User();
    u1.setName("Test");
    u1.setId(1);
    User u2 = new User();
    u2.setName("Another");
    u2.setId(2);
    Mockito.when(service.getUsers()).thenReturn(List.of(u1, u2));
  }

  @Test
  void getUsers_shouldReturnListWithUsers() {
    List<User> result = controller.getUsers();

    assertThat(result).hasSize(2);
    // Arrange - Given - prepare objects, data etc
    // Act - When - perform action or call method for test
    // Assert - Then: getUsers should return a list with users
  }

  // @Test
  // void testGetUser() {
// should return one user and otherwise throw RuntimeException
  }

  // @Test
  // void testCreateUser() {

  // }

  // @Test
  // void testUpdateUser() {

  // }
  
  // @Test
  // void testDeleteUser() {

  // }
