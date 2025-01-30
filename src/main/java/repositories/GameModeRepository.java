package repositories;

import entities.GameMode;

/**
 * Відповідає за збереження обраного режиму гри.
 */
public class GameModeRepository {
  private GameMode selectedGameMode;

  public void setSelectedGameMode(GameMode gameMode) {
    this.selectedGameMode = gameMode;
  }

  public GameMode getSelectedGameMode() {
    return selectedGameMode;
  }
}




