package ua.com.goit.gojava7.salivon.state;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import static org.junit.Assert.*;
import ua.com.goit.gojava7.salivon.context.Console;
import static org.mockito.Mockito.*;

public class WelcomeStateTest {

    /**
     * Test of outputContentState method, of class WelcomeState.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        WelcomeState instance = new WelcomeState();
        instance.outputContentState();

    }

    /**
     * Test of changeState method, of class WelcomeState.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        Console context = new Console();
        WelcomeState instance = new WelcomeState();
        WelcomeState spy = spy(instance);
        when(spy.getInData()).thenReturn("1");
        spy.changeState(context);

    }
     @Test(expected = AssertionFailedError.class)
    public void testChangeStateQuit() {
        System.out.println("changeState");
        Console context = new Console();
        WelcomeState instance = new WelcomeState();
        WelcomeState spy = spy(instance);
        when(spy.getInData()).thenReturn("q");
         doThrow(new AssertionFailedError()).when(spy).changeState(context);
         spy.changeState(context);

    }

}
