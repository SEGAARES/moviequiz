package repositories;

import entities.GameMode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameModeRepository {
  private final List<GameMode> gameModes = new ArrayList<>();

  public void addGameMode(GameMode gameMode) {
    gameModes.add(gameMode);
  }

  public List<GameMode> getAllGameModes() {
    return new ArrayList<>(gameModes);
  }

  public Optional<GameMode> getByMode(String mode) {
    return gameModes.stream()
        .filter(gameMode -> gameMode.getMode().equals(mode))
        .findFirst();
  }

  public void updateGameMode(GameMode gameMode) {
    getByMode(gameMode.getMode()).ifPresent(existingMode -> existingMode.setMode(gameMode.getMode()));
  }

  public void deleteGameMode(String mode) {
    gameModes.removeIf(gameMode -> gameMode.getMode().equals(mode));
  }
}



