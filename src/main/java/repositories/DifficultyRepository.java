package repositories;

import entities.Difficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DifficultyRepository {
  private final List<Difficulty> difficulties = new ArrayList<>();

  public void addDifficulty(Difficulty difficulty) {
    difficulties.add(difficulty);
  }

  public List<Difficulty> getAllDifficulties() {
    return new ArrayList<>(difficulties);
  }

  public Optional<Difficulty> getByLevel(String level) {
    return difficulties.stream()
        .filter(difficulty -> difficulty.getLevel().equals(level))
        .findFirst();
  }

  public void updateDifficulty(Difficulty difficulty) {
    getByLevel(difficulty.getLevel()).ifPresent(existingLevel -> existingLevel.setLevel(difficulty.getLevel()));
  }

  public void deleteDifficulty(String level) {
    difficulties.removeIf(difficulty -> difficulty.getLevel().equals(level));
  }
}


