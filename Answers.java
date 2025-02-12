package hw2;
public class Answer {
  private int id;
  private String text;
  private int questionId;
  public Answer(int id, String text, int questionId) {
      if (text == null || text.trim().isEmpty()) {
          throw new IllegalArgumentException("Answer cannot be empty");
      }
      this.id = id;
      this.text = text;
      this.questionId = questionId;
  }
  public int getId() {
      return id;
  }
  public String getText() {
      return text;
  }
  public int getQuestionId() {
      return questionId;
  }
  public void setText(String text) {
      if (text == null || text.trim().isEmpty()) {
          throw new IllegalArgumentException("Update failed: answer cannot be empty.");
      }
      this.text = text;
  }
  @Override
  public String toString() {
      return "Answer ID: " + id + ", Question ID: " + questionId + ", Text: " + text;
  }
}

