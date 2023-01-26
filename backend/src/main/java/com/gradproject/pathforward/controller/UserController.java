package com.gradproject.pathforward.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gradproject.pathforward.entity.User;
import com.gradproject.pathforward.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/{id}")
  public User getUser(@PathVariable Long id) {
    return userService.getUser(id);
  }

  // Continue moving to service layer
  // @PostMapping
  // public ResponseEntity createUser(@RequestBody User User) throws URISyntaxException {
  //   User savedUser = userService.save(User);
  //   return ResponseEntity.created(new URI("/Users/" + savedUser.getId())).body(savedUser);
  // }

  // @PutMapping("/{id}")
  // public ResponseEntity updateUser(@PathVariable Long id, @RequestBody User User) {
  //   User currentUser = userService.findById(id).orElseThrow(RuntimeException::new);
  //   currentUser.setName(User.getName());
  //   currentUser.setEmail(User.getEmail());
  //   currentUser = userService.save(User);

  //   return ResponseEntity.ok(currentUser);
  // }

  // @DeleteMapping("/{id}")
  // public ResponseEntity deleteUser(@PathVariable Long id) {
  //   userService.deleteById(id);
  //   return ResponseEntity.ok().build();
  // }

}
