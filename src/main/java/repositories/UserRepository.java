package repositories;

import domain.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  private final List<User> users = new ArrayList<>();

  public void add(User user) {
    users.add(user);
  }

  public User getById(String email) {
    return users.stream()
        .filter(user -> user.getEmail().equals(email))
        .findFirst()
        .orElse(null);
  }

  public List<User> getAll() {
    return new ArrayList<>(users);
  }

  public void delete(String email) {
    users.removeIf(user -> user.getEmail().equals(email));
  }
}



