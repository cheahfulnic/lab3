import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 3 , 4 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 4 , 3 }, input2);
  }

  @Test
  public void testReversed2() {
    int[] input2 = { 3 , 4 };
    assertArrayEquals(new int[]{ 4 , 3 }, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 1 , 1 , 2 , 2 };
    assertEquals(5.0/3, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input2 = { 1 , 1 , 0 , 0 };
    assertEquals(2.0/3, ArrayExamples.averageWithoutLowest(input2), 0.001);
  }

}
