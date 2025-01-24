package com.example.moviequiz;

import entities.*;
import repositories.*;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Репозиторії
    UserRepository userRepository = new UserRepository();
    GameModeRepository gameModeRepository = new GameModeRepository();
    DifficultyRepository difficultyRepository = new DifficultyRepository();
    SessionRepository sessionRepository = new SessionRepository();

    // Створення користувачів
    User user1 = new User("Alice", "alice@example.com", "password123");
    User user2 = new User("Bob", "bob@example.com", "password456");
    userRepository.addUser(user1);
    userRepository.addUser(user2);

    // Виведення всіх користувачів
    System.out.println("Users:");
    userRepository.getAllUsers().forEach(System.out::println);

    // Оновлення користувача
    user1.setName("Alice Smith");
    userRepository.updateUser(user1);

    // Видалення користувача
    userRepository.deleteUser("bob@example.com");

    // Додавання режимів гри
    GameMode mode1 = new GameMode("По кадру");
    GameMode mode2 = new GameMode("По цитаті");
    gameModeRepository.addGameMode(mode1);
    gameModeRepository.addGameMode(mode2);

    // Виведення всіх режимів гри
    System.out.println("\nGame Modes:");
    gameModeRepository.getAllGameModes().forEach(System.out::println);

    // Додавання рівнів складності
    Difficulty difficulty1 = new Difficulty("Легко");
    Difficulty difficulty2 = new Difficulty("Складно");
    difficultyRepository.addDifficulty(difficulty1);
    difficultyRepository.addDifficulty(difficulty2);

    // Виведення всіх рівнів складності
    System.out.println("\nDifficulties:");
    difficultyRepository.getAllDifficulties().forEach(System.out::println);

    // Створення сесій
    Session session1 = new Session(user1, mode1, difficulty1);
    Session session2 = new Session(user1, mode2, difficulty2);
    sessionRepository.addSession(session1);
    sessionRepository.addSession(session2);

    // Виведення всіх сесій
    System.out.println("\nSessions:");
    sessionRepository.getAllSessions().forEach(System.out::println);

    // Фільтрація сесій за рівнем складності
    System.out.println("\nSessions with difficulty 'Легко':");
    List<Session> filteredSessions = sessionRepository.filterSessionsByDifficulty("Легко");
    filteredSessions.forEach(System.out::println);

    // Видалення сесії за email користувача
    sessionRepository.deleteSessionByUserEmail("alice@example.com");
    System.out.println("\nSessions after deletion:");
    sessionRepository.getAllSessions().forEach(System.out::println);
  }
}









