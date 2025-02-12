package hw2;
public class Question {
  private int id;
  private String text;
  public Question(int id, String text) {
      if (text == null || text.trim().isEmpty()) {
          throw new IllegalArgumentException("Question cannot be empty");
      }
      this.id = id;
      this.text = text;
  }
  public int getId() {
      return id;
  }
  public String getText() {
      return text;
  }
  public void setText(String text) {
      if (text == null || text.trim().isEmpty()) {
          throw new IllegalArgumentException("Update failed: question cannot be empty.");
      }
      this.text = text;
  }
  @Override
  public String toString() {
      return "Question ID: " + id + ", Text: " + text;
  }
}

