package pertemuan8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;
public class StackTest {
    static Stack<String> stack = new Stack<>();
    @BeforeEach
    void setUp() {
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
    }

    @Test
    void testStackForEach() {
        for (String s : stack) {
            System.out.println(s);
        }
    }

    @Test
    void testStackPop() {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    @Test
    void testStackPeek() {
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
    }

    @Test
    void testStackSearch() {
        assertEquals(5, stack.search("A"));
        assertEquals(4, stack.search("B"));
        assertEquals(3, stack.search("C"));
        assertEquals(2, stack.search("D"));
        assertEquals(1, stack.search("E"));
   }

    @Test
    void testEmpty() {
        stack.clear();
        assertTrue(stack.empty());
    }
}
