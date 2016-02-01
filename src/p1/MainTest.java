package p1;

import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Created by emailman on 2/1/2016.
 */

public class MainTest {

    @Test
    public void testBiggest1() throws Exception {
        int result = Main.biggest(3, 4);
        assertEquals(4, result);
    }

    @Test
    public void testBiggest2() throws Exception {
        int result = Main.biggest(4, 3);
        assertEquals(4, result);
    }

    @Test
    public void testBiggest3() throws Exception {
        int result = Main.biggest(4, 7, 3);
        assertEquals("Test 3 failed: passing three arguments", 7, result);
    }
}