package hw2;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Questions questions = new Questions();
      Answers answers = new Answers();
      Scanner scanner = new Scanner(System.in);
      int questionIdCounter = 1;
      int answerIdCounter = 1;
      while (true) {
          System.out.println("\n1. Add Question\n2. View Questions\n3. Delete Question\n4. Add Answer\n5. View Answers\n6. Exit");
          System.out.print("Choose an option: ");
          int choice = scanner.nextInt();
          scanner.nextLine();  // Consume newline
          switch (choice) {
              case 1:
                  System.out.print("Enter question text: ");
                  String questionText = scanner.nextLine();
                  try {
                      questions.addQuestion(new Question(questionIdCounter++, questionText));
                      System.out.println("Question added successfully.");
                  } catch (IllegalArgumentException e) {
                      System.out.println(e.getMessage());
                  }
                  break;
              case 2:
                  System.out.println("\nList of Questions:");
                  for (Question q : questions.getAllQuestions()) {
                      System.out.println(q);
                  }
                  break;
              case 3:
                  System.out.print("Enter question ID to delete: ");
                  int deleteId = scanner.nextInt();
                  questions.removeQuestion(deleteId);
                  System.out.println("Question removed.");
                  break;
              case 4:
                  System.out.print("Enter question ID to answer: ");
                  int qId = scanner.nextInt();
                  scanner.nextLine();  // Consume newline
                  System.out.print("Enter answer text: ");
                  String answerText = scanner.nextLine();
                  try {
                      answers.addAnswer(new Answer(answerIdCounter++, answerText, qId));
                      System.out.println("Answer added successfully.");
                  } catch (IllegalArgumentException e) {
                      System.out.println(e.getMessage());
                  }
                  break;
              case 5:
                  System.out.print("Enter question ID to view answers: ");
                  int viewQId = scanner.nextInt();
                  System.out.println("\nAnswers for Question ID " + viewQId + ":");
                  for (Answer a : answers.getAnswersForQuestion(viewQId)) {
                      System.out.println(a);
                  }
                  break;
              case 6:
                  System.out.println("Exiting program.");
                  scanner.close();
                  return;
              default:
                  System.out.println("Invalid choice, try again.");
          }
      }