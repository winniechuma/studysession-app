package cs3500.pa02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReadSrFileTest {


 private String question;
  private String answer;
  private DifficultyLevel hard;

  private QuestionAndMetaData que;
  private ArrayList<QuestionAndMetaData> hardQ;
  private ArrayList<QuestionAndMetaData> easyQ;

  @BeforeEach
  public void testQuestion() {
    question = "What is today";
    answer = "Today is someday";
    hard = DifficultyLevel.HARD;
    que = new QuestionAndMetaData(question, answer, hard);
//    hardQ.add(que);
  }

//File f1 = new File("hi/sample.sr");
  Path path = Paths.get("hi/sample.sr");

//ReadSrFile sr = new ReadSrFile();
  @Test
public void testReader() {
    //sr.readSr();
//  assertEquals(hardQ, sr.getHardQuestions());


}
  //come back

}