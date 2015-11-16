package ua.com.goit.gojava7.salivon.handlers;

import org.junit.Test;
import static org.junit.Assert.*;

public class ErrorHandlerStateProjectTest {

    ErrorHandlerStateProject instance = new ErrorHandlerStateProject();

    /**
     * Test of validate method, of class ErrorHandlerStateProject.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        assertEquals(false, instance.validate(""));
        assertEquals(true, instance.validate("1"));
        assertEquals(true, instance.validate("2"));
        assertEquals(true, instance.validate("0"));
    }

}
