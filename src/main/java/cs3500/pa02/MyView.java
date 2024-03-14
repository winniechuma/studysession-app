package cs3500.pa02;

import java.io.IOException;

/**
 * represents everything that will be seen by the user
 */
public class MyView {
  private Appendable outPut;

  /**
   * @param output to be used to print out
   */
  public MyView(Appendable output) {
    this.outPut = output;
  }

  /**
   * welcomes the user before starting their study session and asks for
   * the sr path
   */
  public void Welcome() {
    printString(
        "\n************************* Welcome to Spaced Repetition ************************* \n" +
            "To begin your study session, please insert a full path to a .sr file\n: ");
  }

  /**
   * asks the user how many questions they want to study in the study session
   */
  public void printNumQuestions() {
    printString("how many questions would you like to" +
        " be presented in this study session? \n: ");
  }

  /**
   * @param prompt string representation for any string printing
   */
  public void printString(String prompt) {
    try {
      outPut.append(prompt);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * asks the user when reviewing each question to answer whether the question
   * was difficult or easy
   */
  public void questionMenu() {
    printString("Please type in either 0 or 1 for whatever best suits!\n" +
        "0. change question from easy to hard \n" +
        "1. change question from hard to easy");
  }

  /**
   * shows the user their result after their study session
   */
  public void setEndScreen() {
    printString("The total number of questions answered for this session: \n" +
        "The total number of questions that changed from easy to hard: \n" +
        "The total number of questions that changed from hard to easy: \n" +
        "The updated total number of hard questions in the question bank:\n" +
        "The updated total number of easy questions in the question bank:");
  }

  /**
   * @param question the question for the user
   */
  public void showQuestion(QuestionAndMetaData question) {
    printString("Question: " + question);
  }
}
