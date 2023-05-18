package labtestes2023;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.labtestes2023.InvalidRectangle;
import main.java.labtestes2023.Rectangle;
import main.java.labtestes2023.RectangleImpl;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test(expected = InvalidRectangle.class)
    public void validLength() {
        new RectangleImpl(-2, 5);
    }

    @Test(expected = InvalidRectangle.class)
    public void validWidth() {
        new RectangleImpl(3, -12);
    }

    @Test
    public void getLength() {
        Rectangle a = new RectangleImpl(4, 5);
        assertEquals(a.getLength(), 4);
    }

    @Test
    public void canCreateRectangle() {
        new RectangleImpl(4, 6);
    }

    @Test
    public void canCreateSquare() {
        new RectangleImpl(3, 3);
    }

}
