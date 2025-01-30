package presentation;

import entities.Difficulty;
import entities.GameMode;
import services.UserService;
import services.GameModeService;
import services.DifficultyService;

import java.util.Scanner;

/**
 * Реалізує консольний інтерфейс користувача.
 */
public class ConsoleUI {
  private final UserService userService;
  private final GameModeService gameModeService;
  private final DifficultyService difficultyService;
  private final Scanner scanner;

  public ConsoleUI(UserService userService, GameModeService gameModeService, DifficultyService difficultyService) {
    this.userService = userService;
    this.gameModeService = gameModeService;
    this.difficultyService = difficultyService;
    this.scanner = new Scanner(System.in);
  }

  /**
   * Запускає основний цикл програми.
   */
  public void run() {
    System.out.println("Ласкаво просимо до MovieQuiz!");

    System.out.print("Введіть ім'я користувача: ");
    String username = scanner.nextLine();
    System.out.print("Введіть пароль: ");
    String password = scanner.nextLine();

    if (!userService.login(username, password)) {
      System.out.println("Неправильні облікові дані. Завершення роботи...");
      return;
    }

    System.out.println("Оберіть режим гри: 1) По кадру "
                                        + "2) По цитаті "
                                        + "3) Змішаний");
    int modeChoice = scanner.nextInt();
    GameMode gameMode = switch (modeChoice) {
      case 1 -> GameMode.BY_FRAME;
      case 2 -> GameMode.BY_QUOTE;
      case 3 -> GameMode.MIXED;
      default -> throw new IllegalArgumentException("Неправильний вибір");
    };
    gameModeService.selectGameMode(gameMode);

    System.out.println("Оберіть рівень складності: 1) Легко "
                                                + "2) Середньо "
                                                + "3) Складно");
    int difficultyChoice = scanner.nextInt();
    Difficulty difficulty = switch (difficultyChoice) {
      case 1 -> Difficulty.EASY;
      case 2 -> Difficulty.MEDIUM;
      case 3 -> Difficulty.HARD;
      default -> throw new IllegalArgumentException("Неправильний вибір");
    };
    difficultyService.selectDifficulty(difficulty);

    System.out.println("Запуск гри з режимом " + gameMode + " і рівнем складності " + difficulty);
  }
}