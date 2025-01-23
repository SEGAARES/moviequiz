package entities;

public class User {
  private String name;
  private String email;
  private String password;

    public User(String name, String email, String password) {
      if (name == null || name.trim().isEmpty()) {
        throw new IllegalArgumentException("Name cannot be null or empty.");
      }
      if (email == null || !email.matches(".+@.+\\..+")) {
        throw new IllegalArgumentException("Invalid email format.");
      }
      if (password == null || password.length() < 8) {
        throw new IllegalArgumentException("Password must be at least 8 characters.");
      }
      this.name = name;
      this.email = email;
      this.password = password;
    }

    @Override
    public String toString() {
      return "User{name='" + name + "', email='" + email + "', password='" + password + "'}";
    }
  }

