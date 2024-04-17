package cs2.adt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class StackTester {
  Stack<Integer> s;
  @BeforeEach
  void init() {
    s = new ArrayStack<Integer>();
  }
  @Test
  void testPushPop() {
    assertTrue(s.isEmpty());
    s.push(7);
    assertFalse(s.isEmpty());
    assertTrue(s.peek() == 7);
    assertTrue(s.pop() == 7);
    assertTrue(s.isEmpty());
    //s.pop();
  }
}
