package entities;

public class GameMode {
  private String mode;

  public GameMode(String mode) {
    if (mode == null || mode.trim().isEmpty()) {
      throw new IllegalArgumentException("Mode cannot be null or empty.");
    }
    this.mode = mode;
  }

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  @Override
  public String toString() {
    return "GameMode{mode='" + mode + "'}";
  }
}




