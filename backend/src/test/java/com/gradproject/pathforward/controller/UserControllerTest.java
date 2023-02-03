package com.gradproject.pathforward.controller;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
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
    Mockito.when(service.getUser(1L)).thenReturn(u1);
    Mockito.when(service.getUser(3L)).thenReturn(null);
  }

  @AfterEach
  void tearDown() {
    Mockito.reset(service);
  }

  @Test
  void getUsers_shouldReturnListWithUsers() {
    List<User> result = controller.getUsers();

    assertThat(result).hasSize(2);
    // Arrange - Given - prepare objects, data etc
    // Act - When - perform action or call method for test
    // Assert - Then: getUsers should return a list with users
  }

  @Test
  void getUser_shouldReturnCorrectUser() {
    User result = controller.getUser(1L);
    assertThat(result.getId()).isEqualTo(1L);
    assertThat(result.getName()).isEqualTo("Test");
  }

  @Test
  void getUser_shouldReturnNullIfNoUserFound() {
    User result = controller.getUser(3L);
    assertThat(result).isNull();
  }

  @Test
  void getUser_shouldCallGetUserOnService() {
    controller.getUser(1L);
    Mockito.verify(service, Mockito.times(1)).getUser(1L);
  }
}
