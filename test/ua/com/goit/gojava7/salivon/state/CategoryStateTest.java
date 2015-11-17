package ua.com.goit.gojava7.salivon.state;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import ua.com.goit.gojava7.salivon.context.Console;

public class CategoryStateTest {

    /**
     * Test of outputContentState method, of class CategoryState.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        CategoryState instance = new CategoryState();
        State.setIndexCategory(1);
        instance.outputContentState();
    }

    /**
     * Test of changeState method, of class CategoryState.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        Console context = new Console();
        CategoryState instance = new CategoryState();
        CategoryState spy = spy(instance);
        when(spy.getInData()).thenReturn("1");
        spy.changeState(context);
    }

    @Test(expected = AssertionFailedError.class)
    public void testChangeStateQuit() {
        System.out.println("changeState");
        Console context = new Console();
       CategoryState instance = new CategoryState();
        CategoryState spy = spy(instance);
        when(spy.getInData()).thenReturn("q");
        doThrow(new AssertionFailedError()).when(spy).changeState(context);
        spy.changeState(context);

    }

}
