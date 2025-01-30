package com.example.moviequiz;

import domain.entities.User;
import repositories.UserRepository;
import repositories.GameModeRepository;
import repositories.DifficultyRepository;
import services.UserService;
import services.GameModeService;
import services.DifficultyService;
import presentation.ConsoleUI;

public class Main {
  public static void main(String[] args) {
    UserRepository userRepository = new UserRepository();
    GameModeRepository gameModeRepository = new GameModeRepository();
    DifficultyRepository difficultyRepository = new DifficultyRepository();

    UserService userService = new UserService(userRepository);
    GameModeService gameModeService = new GameModeService(gameModeRepository);
    DifficultyService difficultyService = new DifficultyService(difficultyRepository);

    userRepository.add(new User("max", "max@student.com", Integer.toHexString("12334556".hashCode()), false));

    ConsoleUI consoleUI = new ConsoleUI(userService, gameModeService, difficultyService);
    consoleUI.run();
  }
}














