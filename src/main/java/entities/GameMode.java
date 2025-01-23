package entities;

public class GameMode {
  private String mode;

    public GameMode(String mode) {
      if (mode == null || (!mode.equals("По кадру") && !mode.equals("По цитаті") && !mode.equals("Змішаний"))) {
        throw new IllegalArgumentException("Invalid game mode: Must be 'По кадру', 'По цитаті', or 'Змішаний'.");
      }
      this.mode = mode;
    }

    @Override
    public String toString() {
      return "GameMode{mode='" + mode + "'}";
    }
  }


