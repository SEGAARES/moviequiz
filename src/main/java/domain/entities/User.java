package domain.entities;

/**
 * Представляє користувача системи.
 */
public class User {
  private String username;
  private String email;
  private String passwordHash;
  private boolean isAdmin;

  public User(String username, String email, String passwordHash, boolean isAdmin) {
    this.username = username;
    this.email = email;
    this.passwordHash = passwordHash;
    this.isAdmin = isAdmin;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public String getPasswordHash() {
    return passwordHash;
  }

  public boolean isAdmin() {
    return isAdmin;
  }
}
