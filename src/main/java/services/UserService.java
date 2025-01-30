package services;
import domain.entities.User;
import repositories.UserRepository;

import java.util.List;

public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> getAllUsers() {
    return userRepository.getAll();
  }

  public User getUserByEmail(String email) {
    return userRepository.getById(email);
  }

  public void deleteUser(String email) {
    userRepository.delete(email);
  }
}




