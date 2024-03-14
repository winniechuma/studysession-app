package cs3500.pa02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuestionTest {

  String question;
  String answer;
  DifficultyLevel hard;
  QuestionAndMetaData que;

  @BeforeEach
      public void testQuestion() {
    question = "What is today";
    answer = "Today is someday";
    hard = DifficultyLevel.HARD;
    que = new QuestionAndMetaData(question, answer, hard);

  }

  @Test
  public void testGetQuestion() {
    assertEquals(question, que.getQuestion());
  }
  @Test
  public void testGetAnswer() {
    assertEquals(answer, que.getAnswer());
  }
  @Test
  public void testGetDifficulty() {
    assertEquals(hard, que.getDifficulty());
  }

}