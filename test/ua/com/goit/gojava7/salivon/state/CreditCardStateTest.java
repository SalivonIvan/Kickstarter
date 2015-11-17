package ua.com.goit.gojava7.salivon.state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import ua.com.goit.gojava7.salivon.context.Console;

public class CreditCardStateTest {

    /**
     * Test of outputContentState method, of class CreditCardState.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        CreditCardState instance = new CreditCardState();
        instance.outputContentState();

    }

    /**
     * Test of changeState method, of class CreditCardState.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        Console context = mock(Console.class);
        NameInvestState instance = new NameInvestState();
        instance.changeState(context);
        verify(context).setCurrentState(anyObject());
    }

}
