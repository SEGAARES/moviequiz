package repositories;

import domain.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Відповідає за збереження та управління даними користувачів.
 */
public class UserRepository {
  private final List<User> users = new ArrayList<>();

  /**
   * Додає нового користувача до репозиторію.
   * @param newUser новий користувач для додавання
   */
  public void add(User newUser) {
    users.add(newUser);
  }

  /**
   * Знаходить користувача за email.
   * @param email електронна пошта користувача
   * @return об'єкт User, якщо знайдено, або null
   */
  public User getById(String email) {
    return users.stream()
        .filter(user -> user.getEmail().equals(email))
        .findFirst()
        .orElse(null);
  }

  /**
   * Знаходить користувача за ім'ям.
   * @param username ім'я користувача
   * @return об'єкт User, якщо знайдено, або null
   */
  public User findByUsername(String username) {
    return users.stream()
        .filter(user -> user.getUsername().equals(username))
        .findFirst()
        .orElse(null);
  }
}




