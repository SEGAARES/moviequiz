package services;

import domain.entities.User;
import repositories.UserRepository;

/**
 * Сервіс для аутентифікації користувачів.
 */
public class AuthenticationService {
  private final UserRepository userRepository;

  public AuthenticationService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  /**
   * Реєструє нового користувача.
   * @param name ім'я користувача
   * @param email електронна пошта користувача
   * @param password пароль користувача
   * @return true, якщо реєстрація успішна
   * @throws IllegalArgumentException якщо користувач із таким email вже існує
   */
  public boolean registerUser(String name, String email, String password) {
    if (userRepository.getById(email) != null) {
      throw new IllegalArgumentException("Користувач із таким email вже існує!");
    }

    User newUser = new User(name, email, hashPassword(password), false);
    userRepository.add(newUser);
    sendRegistrationEmail(email, name);
    return true;
  }

  private String hashPassword(String password) {
    return Integer.toHexString(password.hashCode());
  }

  private void sendRegistrationEmail(String email, String name) {
    // Логіка для відправки електронного листа
    System.out.println("Лист для підтвердження відправлено на " + email);
  }
}





