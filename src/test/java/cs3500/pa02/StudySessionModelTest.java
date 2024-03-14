package cs3500.pa02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class StudySessionModelTest {

private String question1 = "What is even summer?";
private String answer = "No life";
private DifficultyLevel hard = DifficultyLevel.HARD;
private DifficultyLevel easy = DifficultyLevel.EASY;
  //(String question, String answer, DifficultyLevel difficulty)
QuestionAndMetaData question = new QuestionAndMetaData(question1, answer, hard);
//StudySessionModel ss = new StudySessionModel();

ArrayList<QuestionAndMetaData> result;
@Test
public void testStudySession() {
  //assertEquals(result, ss.shuffle());

}







//  public class StudySessionModel {
//    private ArrayList<String> generatedQuestions;
//
//    ReadSrFile sr = new ReadSrFile();
//
//    public ArrayList<QuestionAndMetaData> shuffle() {
//      ArrayList<QuestionAndMetaData> hardShuffled = sr.getHardQuestions();
//      Collections.shuffle(hardShuffled);
//      ArrayList<QuestionAndMetaData> easyShuffled = sr.getEasyQuestions();
//      Collections.shuffle(easyShuffled);
//      hardShuffled.addAll(easyShuffled);
//      return hardShuffled;
//    }
//  }

}