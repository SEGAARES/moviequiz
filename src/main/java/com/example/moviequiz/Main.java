package com.example.moviequiz;

import entities.Difficulty;
import entities.GameMode;
import entities.Session;
import entities.User;

public class Main {
  public static void main(String[] args) {
    try {
      User invalidUser = new User("", "invalidEmail", "123");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    try {
      GameMode invalidGameMode = new GameMode("Неправильний режим");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    try {
      Difficulty invalidDifficulty = new Difficulty("Неправильна складність");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }

    try {
      User validUser = new User("Alice", "alice@example.com", "password123");
      GameMode validGameMode = new GameMode("По кадру");
      Difficulty validDifficulty = new Difficulty("Середньо");
      Session validSession = new Session(validUser, validGameMode, validDifficulty);
      System.out.println("Valid session created: " + validSession);
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}







