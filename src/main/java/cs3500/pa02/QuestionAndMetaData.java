package cs3500.pa02;

/**
 * a representation of a Question (with metadata in the sr file)
 */
public class QuestionAndMetaData {
  private String question;
  private String answer;
  private DifficultyLevel difficulty;

  /**
   * @param question   the question
   * @param answer     the answer to the question
   * @param difficulty the difficulty of the question
   */
  public QuestionAndMetaData(String question, String answer, DifficultyLevel difficulty) {
    this.question = question;
    this.answer = answer;
    this.difficulty = difficulty;
  }

  /**
   * @return the question part
   */
  public String getQuestion() {
    return this.question;
  }

  /**
   * @return the answer part
   */
  public String getAnswer() {
    return this.answer;
  }

  /**
   * @return either hard or easy
   */
  public DifficultyLevel getDifficulty() {
    return this.difficulty;
  }
}
