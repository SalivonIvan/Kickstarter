
package ua.com.goit.gojava7.salivon.handlers;


import org.junit.Test;
import static org.junit.Assert.*;

public class ErrorHandlerStateCreditCardTest {
    
   ErrorHandlerStateCreditCard instance = new ErrorHandlerStateCreditCard();
    /**
     * Test of validate method, of class ErrorHandlerStateCreditCard.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        assertEquals(true, instance.validate("1"));
    }
    
}