package repositories;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
  private final List<User> users = new ArrayList<>();

  public void addUser(User user) {
    users.add(user);
  }

  public List<User> getAllUsers() {
    return new ArrayList<>(users);
  }

  public Optional<User> getByEmail(String email) {
    return users.stream()
        .filter(user -> user.getEmail().equals(email))
        .findFirst();
  }

  public void updateUser(User user) {
    getByEmail(user.getEmail()).ifPresent(existingUser -> {
      existingUser.setName(user.getName());
      existingUser.setPassword(user.getPassword());
    });
  }

  public void deleteUser(String email) {
    users.removeIf(user -> user.getEmail().equals(email));
  }
}


