package entities;

import domain.entities.User;

public class Session {
  private User user;
  private Difficulty gameMode;
  private Difficulty difficulty;

  public Session(User user, Difficulty gameMode, Difficulty difficulty) {
    if (user == null || gameMode == null || difficulty == null) {
      throw new IllegalArgumentException("Session properties cannot be null.");
    }
    this.user = user;
    this.gameMode = gameMode;
    this.difficulty = difficulty;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Difficulty getGameMode() {
    return gameMode;
  }

  public void setGameMode(Difficulty gameMode) {
    this.gameMode = gameMode;
  }

  public Difficulty getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Difficulty difficulty) {
    this.difficulty = difficulty;
  }

  @Override
  public String toString() {
    return "Session{user=" + user + ", gameMode=" + gameMode + ", difficulty=" + difficulty + "}";
  }
}




