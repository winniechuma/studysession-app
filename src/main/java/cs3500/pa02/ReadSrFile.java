package cs3500.pa02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * read sr file representation
 */
public class ReadSrFile {

  private ArrayList<QuestionAndMetaData> hardQuestions;
  private ArrayList<QuestionAndMetaData> easyQuestions;
  private UserInputController uc;

  private Scanner sc;
  private String input;
  private String[] line ;
  private QuestionAndMetaData question;

  /**
   * readSrFile constructor
   */
  public ReadSrFile() {
    this.hardQuestions = new ArrayList<>();
    this.easyQuestions = new ArrayList<>();
    this.uc = new UserInputController();

    this.sc = new Scanner(uc.getSRPath());
    this.input = sc.nextLine();
    this.line = input.split(">>");
    this.question = new QuestionAndMetaData(line[0], line[1],DifficultyLevel.valueOf(line[2]));
  }

  /**
   * reads an sr file and adds questions to two lists depending on whether
   * the question is hard or difficult.
   */
  public void readSr () {
    if (question.getDifficulty().equals(DifficultyLevel.HARD)) {
      hardQuestions.add(question);
    } else {
      easyQuestions.add(question);
    }
  }

  /**
   * @return a list of hard questions
   */
  public ArrayList<QuestionAndMetaData> getHardQuestions() {
    return this.hardQuestions;
  }

  /**
   * @return a list of easy questions
   */
  public ArrayList<QuestionAndMetaData> getEasyQuestions() {
    return this.easyQuestions;
  }

}
