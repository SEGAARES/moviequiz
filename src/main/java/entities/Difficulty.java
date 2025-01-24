package entities;

public class Difficulty {
  private String level;

  public Difficulty(String level) {
    if (level == null || level.trim().isEmpty()) {
      throw new IllegalArgumentException("Level cannot be null or empty.");
    }
    this.level = level;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "Difficulty{level='" + level + "'}";
  }
}





