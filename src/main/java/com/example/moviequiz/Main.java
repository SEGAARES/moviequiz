package com.example.moviequiz;

import domain.entities.User;
import repositories.UserRepository;
import services.AuthenticationService;

public class Main {
  public static void main(String[] args) {
    // Ініціалізація репозиторія та сервісів
    UserRepository userRepository = new UserRepository();
    AuthenticationService authService = new AuthenticationService(userRepository);

    try {
      // Реєстрація користувачів
      authService.registerUser("Alice", "alice@example.com", "password123");
      authService.registerUser("Bob", "bob@example.com", "password456");

      // Логін користувача
      User loggedInUser = authService.loginUser("alice@example.com", "password123");
      System.out.println("Вхід успішний! Ласкаво просимо, " + loggedInUser.getName());

      // Логін з неправильним паролем
      authService.loginUser("alice@example.com", "wrongpassword");
    } catch (Exception e) {
      System.out.println("Помилка: " + e.getMessage());
    }
  }
}











