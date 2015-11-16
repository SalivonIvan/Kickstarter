package ua.com.goit.gojava7.salivon.handlers;

import org.junit.Test;
import static org.junit.Assert.*;

public class ErrorHandlerStateCategoryTest {

    ErrorHandlerStateCategory instance = new ErrorHandlerStateCategory();

    /**
     * Test of validate method, of class ErrorHandlerStateCategory.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        assertEquals(false, instance.validate(""));
        assertEquals(true, instance.validate("0"));
        assertEquals(false, instance.validate("10"));
        assertEquals(false, instance.validate("2"));
    }

}
