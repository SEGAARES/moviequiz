package repositories;

import entities.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SessionRepository {
  private final List<Session> sessions = new ArrayList<>();

  public void addSession(Session session) {
    sessions.add(session);
  }

  public List<Session> getAllSessions() {
    return new ArrayList<>(sessions);
  }

  public Optional<Session> findSessionByUserEmail(String email) {
    return sessions.stream()
        .filter(session -> session.getUser().getEmail().equals(email))
        .findFirst();
  }

  public void deleteSessionByUserEmail(String email) {
    sessions.removeIf(session -> session.getUser().getEmail().equals(email));
  }

  /**
   * Фільтрувати сесії за рівнем складності.
   *
   * @param difficulty Рівень складності.
   * @return Список сесій, що відповідають заданому рівню складності.
   */
  public List<Session> filterSessionsByDifficulty(String difficulty) {
    return sessions.stream()
        .filter(session -> session.getDifficulty().getLevel().equals(difficulty))
        .collect(Collectors.toList());
  }

}



