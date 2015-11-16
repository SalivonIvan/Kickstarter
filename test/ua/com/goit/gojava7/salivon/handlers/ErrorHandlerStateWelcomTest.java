package ua.com.goit.gojava7.salivon.handlers;

import org.junit.Test;
import static org.junit.Assert.*;

public class ErrorHandlerStateWelcomTest {

    ErrorHandlerStateWelcom instance = new ErrorHandlerStateWelcom();

    /**
     * Test of validate method, of class ErrorHandlerStateWelcom.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        assertEquals(false, instance.validate(""));
        assertEquals(true, instance.validate("1"));

    }

}
