package cs3500.pa02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DifficultyLevelTest {
  @Test
  public void testDifficulty() {
    assertEquals(DifficultyLevel.EASY, DifficultyLevel.valueOf("EASY"));
    assertEquals(DifficultyLevel.HARD, DifficultyLevel.valueOf("HARD"));


    assertEquals(0, DifficultyLevel.EASY.ordinal());
    assertEquals(1, DifficultyLevel.HARD.ordinal());
  }

}