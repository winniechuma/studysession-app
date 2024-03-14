package cs3500.pa02;
import java.util.ArrayList;
import java.util.Collections;

/**
 * a study session representation
 */
public class StudySessionModel {
  ReadSrFile sr = new ReadSrFile();

  /**
   * @return the shuffled list of questions and its metadata
   */
  public ArrayList<QuestionAndMetaData> shuffle() {
    ArrayList<QuestionAndMetaData> hardShuffled = sr.getHardQuestions();
    Collections.shuffle(hardShuffled);
    ArrayList<QuestionAndMetaData> easyShuffled = sr.getEasyQuestions();
    Collections.shuffle(easyShuffled);
    hardShuffled.addAll(easyShuffled);
    return hardShuffled;
  }
}

// comments:
// Collections.shuffle();
// read the file
// extract the question
// shuffle them







