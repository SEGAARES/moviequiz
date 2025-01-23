package entities;

public class Session {
  private User user;
  private GameMode gameMode;
  private Difficulty difficulty;

    public Session(User user, GameMode gameMode, Difficulty difficulty) {
      if (user == null) {
        throw new IllegalArgumentException("User cannot be null.");
      }
      if (gameMode == null) {
        throw new IllegalArgumentException("Game mode cannot be null.");
      }
      if (difficulty == null) {
        throw new IllegalArgumentException("Difficulty cannot be null.");
      }
      this.user = user;
      this.gameMode = gameMode;
      this.difficulty = difficulty;
    }

    @Override
    public String toString() {
      return "Session{user=" + user + ", gameMode=" + gameMode + ", difficulty=" + difficulty + "}";
    }
  }

