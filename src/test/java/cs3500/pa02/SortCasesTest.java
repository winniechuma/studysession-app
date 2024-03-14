package cs3500.pa02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * sort cases test representation
 */
class SortCasesTest {

  /**
   * tests the sorting of the three flag
   */
  @Test
  public void testSortCases() {
    assertEquals(3, SortCases.values().length);
    assertEquals(SortCases.FILENAME, SortCases.valueOf("FILENAME"));
    assertEquals(SortCases.CREATED, SortCases.valueOf("CREATED"));
    assertEquals(SortCases.MODIFIED, SortCases.valueOf("MODIFIED"));

    assertEquals(0, SortCases.FILENAME.ordinal());
    assertEquals(1, SortCases.CREATED.ordinal());
    assertEquals(2, SortCases.MODIFIED.ordinal());
  }
}

