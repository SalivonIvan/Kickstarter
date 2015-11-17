package ua.com.goit.gojava7.salivon.state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import ua.com.goit.gojava7.salivon.context.Console;

public class NameInvestStateTest {

    /**
     * Test of outputContentState method, of class NameInvestState.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        NameInvestState instance = new NameInvestState();
        instance.outputContentState();
    }

    /**
     * Test of changeState method, of class NameInvestState.
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
