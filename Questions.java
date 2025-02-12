package hw2;
import java.util.ArrayList;
import java.util.List;
public class Questions {
  private List<Question> questionList = new ArrayList<>();
  public void addQuestion(Question q) {
      questionList.add(q);
  }
  public void removeQuestion(int id) {
      questionList.removeIf(q -> q.getId() == id);
  }
  public Question getQuestion(int id) {
      return questionList.stream()
              .filter(q -> q.getId() == id)
              .findFirst()
              .orElse(null);
  }
  public List<Question> getAllQuestions() {
      return questionList;
  }
}
