package services;

public class EmailService {
  public void sendEmail(String to, String subject, String body) {
    System.out.printf("Надсилаємо email до: %s%nТема: %s%nТекст: %s%n", to, subject, body);
  }
}

