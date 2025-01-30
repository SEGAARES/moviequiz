package services;

import entities.GameMode;
import repositories.GameModeRepository;

/**
 * Реалізує бізнес-логіку для роботи з режимами гри.
 */
public class GameModeService {
  private final GameModeRepository gameModeRepository;

  public GameModeService(GameModeRepository gameModeRepository) {
    this.gameModeRepository = gameModeRepository;
  }

  public void selectGameMode(GameMode gameMode) {
    gameModeRepository.setSelectedGameMode(gameMode);
  }

  public GameMode getSelectedGameMode() {
    return gameModeRepository.getSelectedGameMode();
  }
}

