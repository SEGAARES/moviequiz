package repositories;

import entities.Difficulty;

/**
 * Відповідає за збереження обраного рівня складності.
 */
public class DifficultyRepository {
  private Difficulty selectedDifficulty;

  public void setSelectedDifficulty(Difficulty difficulty) {
    this.selectedDifficulty = difficulty;
  }

  public Difficulty getSelectedDifficulty() {
    return selectedDifficulty;
  }
}

