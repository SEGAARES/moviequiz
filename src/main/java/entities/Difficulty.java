package entities;

public class Difficulty {
  private String level;

    public Difficulty(String level) {
      if (level == null || (!level.equals("Легко") && !level.equals("Середньо") && !level.equals("Складно"))) {
        throw new IllegalArgumentException("Invalid difficulty level: Must be 'Легко', 'Середньо', or 'Складно'.");
      }
      this.level = level;
    }

    @Override
    public String toString() {
      return "Difficulty{level='" + level + "'}";
    }
  }



