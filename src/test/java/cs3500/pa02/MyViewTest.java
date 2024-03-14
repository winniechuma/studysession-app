package cs3500.pa02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyViewTest {

  //Appendable ap;
  private MyView sv;
  //SettingsView m =new
  private StringBuilder sb;
  private String welcomeRes;
  private String numQueRes;
  private String endScreen;
  private String menu;
  private String question;
  private String answer;
  private DifficultyLevel hard;
  private QuestionAndMetaData que;

  private String resQNA;

  @BeforeEach
  public void setUp() {
     sb = new StringBuilder();
     sv = new MyView(sb);

     welcomeRes = "\n************************* Welcome to Spaced Repetition ************************* \n" +
         "To begin your study session, please insert a full path to a .sr file\n: ";
     numQueRes = "how many questions would you like to be presented in this study session? \n: ";
     endScreen = "The total number of questions answered for this session: \n" +
        "The total number of questions that changed from easy to hard: \n" +
        "The total number of questions that changed from hard to easy: \n" +
        "The updated total number of hard questions in the question bank:\n" +
        "The updated total number of easy questions in the question bank:";
     menu = "Please type in either 0 or 1 for whatever best suits!\n" +
          "0. change question from easy to hard \n" +
          "1. change question from hard to easy";
    question = "What is today";
    answer = "Today is someday";
    hard = DifficultyLevel.HARD;
    que = new QuestionAndMetaData(question, answer, hard);
    resQNA = "Question: " + que;

  }

  @Test
  public void testWelcome() {
    sv.Welcome();
    assertEquals(welcomeRes, sb.toString());
  }

  @Test
  public void testNumQuestion() {
    sv.printNumQuestions();
   assertEquals(numQueRes, sb.toString());
  }

  @Test
  public void testEndScreen() {
    sv.setEndScreen();
    assertEquals(endScreen, sb.toString());
  }

  @Test
  public void testQuestionMenu() {
    sv.questionMenu();
    assertEquals(menu, sb.toString());
  }

  @Test
  public void testShowQuestion() {
    sv.showQuestion(que);
    assertEquals(resQNA, sb.toString());
  }
}





//package cs3500.pa02;
//
//    import java.io.IOException;
//
//public class SettingsView {
//  //private Scanner userInput;
////  private Scanner sc = new Scanner(System.in);
////  private int numQuestions;
////  private String userSr;
//  private Appendable outPut;
//
//  public SettingsView(Appendable output) {
//    this.outPut = output;
//    //userInput = new Scanner (System.in);
//  }
//
//  /**
//   * welcomes the user before starting their study session
//   */
//  public void Welcome()  {
//    try {
//      outPut.append(
//          "\n************************* Welcome to Spaced Repetition ************************* \n" +
//              "To begin your study session, please insert a full path to a .sr file\n: ");
//    } catch(IOException e) {
//      e.printStackTrace();
//    }
//
//  }
//
////  public String getSRPath(){
////    userSr = sc.nextLine();
////    return userSr;
////  }
//
//  /**
//   * asks the user how many questions they want to study
//   */
//  public void printNumQuestions() {
//    try {
//      outPut.append("how many questions would you like to" +
//          " be presented in this study session? \n: ");
//
//    } catch(IOException e) {
//      e.printStackTrace();
//    }
//
//  }
//
////  public int getNumOfQuestions() {
////    //check if the input is string
////    //try {
////      numQuestions = Integer.parseInt(sc.next());
//////    } catch (NumberFormatException e) {
//////
//////      printString("Please enter a valid positive integer\n:");
////
////   // }
////    return numQuestions;
////
////  }
//
//
//  public void printString(String prompt)  {
//    try {
//      outPut.append(prompt);
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }
//  }
//  int userResponse;
//
//  /**
//   * asks the user when reviewing each question to answer whether the question
//   * was difficult or easy
//   */
//  public void questionMenu() {
//    try {
//      outPut.append("Please type in either 0 or 1 for whatever best suits!\n" +
//          "0. change question from easy to hard \n" +
//          "1. change question from hard to easy");
//      //userResponse = sc.nextInt(); // should be in controller
//    } catch(IOException e) {
//      e.printStackTrace();
//    }
//    //return userResponse;
//  }
//
//  /**
//   * show the user the question one at a time
//   */
////  public void setEndScreen(paramater) {
////    System.out.println("The total number of questions answered for this session: \n" +
////        "The total number of questions that changed from easy to hard: \n" +
////        "The total number of questions that changed from hard to easy: \n" +
////        "The updated total number of hard questions in the question bank:\n" +
////        "The updated total number of easy questions in the question bank:");
////  }
//  public void showQuestion () {
//
//  }
//}
