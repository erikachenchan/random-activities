package randomexercises.RockPaperSci;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RockPaperSciTest {

    @Test
    @DisplayName("Testing to check the comparison of two array of strings")
    public void testStringArray() throws Exception {
        String[] expected = new String[]{"rock", "paper", "scissor"};
        String[] actual = new String[]{"rock", "paper", "scissor"};
        assertArrayEquals(expected, actual);

    }

    @Test
    @DisplayName("Verify if each object inside the array is a string")
    public void testElementIsString() throws Exception {
        String[] array = {"3", "4", "Hello"};

        for (Object obj : array) {
            assertTrue(obj instanceof String, "Element is not a string");
        }
    }


}
