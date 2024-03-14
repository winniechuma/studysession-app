package cs3500.pa02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * a class representation that receives and decides what to do after the user inserts in
 * anything in the console
 */
public class UserInputController {

  private Scanner sc = new Scanner(System.in);
  private MyView sv = new MyView(System.out);
  private int numQuestions;
  private String userSr;

  private StudySessionModel model;
  private ArrayList<QuestionAndMetaData> questions;

  private int userNumInput;

  /**
   * @return the sr path given by the user
   */
  public String getSRPath() {
    userSr = sc.nextLine();
    return userSr;
  }

  /**
   * @return the user inputted int number
   */
  public int getUserInput() {
    userNumInput = sc.nextInt();
    return userNumInput;
  }


  /**
   * @throws IOException if the numQuestions
   */
  public void getquestionMenuResponse() throws IOException {
    userNumInput = sc.nextInt();
    if (getNumOfQuestions() == 0) {
      sv.printString("You have changed this question from easy to hard");
      assignQuestions();
    } else if (getNumOfQuestions() == 1) {
      sv.printString("You have changed this question from hard to easy");
      assignQuestions();
    } else {
      getNumOfQuestions();
    }
  }

  /**
   * @return the int number the user inputs
   * checks to see if it is a valid integer and greater than 0
   */
  public int getNumOfQuestions() {
    //check if the input is string
    boolean isValid = true;
    while (isValid) {
      try {
        numQuestions = Integer.parseInt(sc.next());
        if (numQuestions < 0) {
          sv.printString("Please enter a valid positive integer\n:");
        }
      } catch (NumberFormatException e) {
        sv.printString("This is not a number, insert a  number\n:");
      }
    }
    return numQuestions;
  }


  /**
   * @throws FileNotFoundException if the file inserted by the user isn't found
   *                               run for the user to input and get input
   */
  public void run() throws IOException {
    sv.Welcome();
    String srPath = getSRPath();
    // Check for if the file exists, if it does check if the file ens with .sr
    // Get user input until the entered path is valid.
    Path userPath = Paths.get(srPath);
    boolean isValid = true;
    while (isValid) {
      userPath = Paths.get(srPath);
      if (userPath.toFile().isFile()) {
        if (srPath.endsWith(".sr")) {
          isValid = false;
          sv.printNumQuestions();
          int numQ = getNumOfQuestions();
          break;
        } else {
          sv.printString("Please insert an sr file\n: ");
          srPath = getSRPath();
        }
      } else {
        sv.printString("The file was not valid, Please insert again " +
            "with a valid path\n: ");
        srPath = getSRPath();
      }
    }
    //assignQuestions();
    //sv.setEndScreen();
  }


  /**
   * assigns the questions to the user depending on the number of questions
   * asked by them
   */
  public void assignQuestions(){
   model = new StudySessionModel();
   questions = model.shuffle();

    //call your model
    if (userNumInput <= questions.size()) {
      for (int i = 0; i < questions.size() - userNumInput; i++) {
        if (questions.contains(DifficultyLevel.HARD)) {
          //sv.
          sv.showQuestion(questions.get(i));
          sv.questionMenu();
        } else {
          sv.showQuestion(questions.get(i));
          sv.questionMenu();
        }
      }
    } else {
      // if given 10 but have 9 in the file
      for (int i = 0; i < questions.size(); i++) {
        if (questions.contains(DifficultyLevel.HARD)) {
          //sv.
          sv.showQuestion(questions.get(i));
          sv.questionMenu();
        } else {
          sv.showQuestion(questions.get(i));
          sv.questionMenu();
        }
      }
    }

  }
}

