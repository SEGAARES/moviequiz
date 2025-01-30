package services;

import entities.Difficulty;
import repositories.DifficultyRepository;

/**
 * Реалізує бізнес-логіку для роботи з рівнями складності.
 */
public class DifficultyService {
  private final DifficultyRepository difficultyRepository;

  public DifficultyService(DifficultyRepository difficultyRepository) {
    this.difficultyRepository = difficultyRepository;
  }

  public void selectDifficulty(Difficulty difficulty) {
    difficultyRepository.setSelectedDifficulty(difficulty);
  }

  public Difficulty getSelectedDifficulty() {
    return difficultyRepository.getSelectedDifficulty();
  }
}

