package services;

import domain.entities.User;
import repositories.UserRepository;

/**
 * Реалізує бізнес-логіку для роботи з користувачами.
 */
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public boolean register(String username, String email, String password, boolean isAdmin) {
    if (userRepository.findByUsername(username) != null) {
      return false; // Користувач вже існує
    }

    String hashedPassword = hashPassword(password);
    userRepository.add(new User(username, email, hashedPassword, isAdmin));
    return true;
  }

  public boolean login(String username, String password) {
    User user = userRepository.findByUsername(username);
    if (user != null && user.getPasswordHash().equals(hashPassword(password))) {
      return true;
    }
    return false;
  }

  private String hashPassword(String password) {
    return Integer.toHexString(password.hashCode());
  }
}
