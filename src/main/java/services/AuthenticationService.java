package services;

import domain.entities.User;
import repositories.UserRepository;

public class AuthenticationService {
  private final UserRepository userRepository;

  public AuthenticationService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public boolean registerUser(String name, String email, String password) {
    if (userRepository.getById(email) != null) {
      throw new IllegalArgumentException("Користувач із таким email вже існує!");
    }

    User newUser = new User(name, email, password);
    userRepository.add(newUser);
    sendRegistrationEmail(email, name);
    return true;
  }

  public User loginUser(String email, String password) {
    User user = userRepository.getById(email);
    if (user == null || !user.getPassword().equals(password)) {
      throw new IllegalArgumentException("Невірний email або пароль.");
    }
    return user;
  }

  private void sendRegistrationEmail(String email, String name) {
    System.out.printf("Email відправлено на %s: Привіт, %s! Реєстрація успішна.%n", email, name);
  }
}




