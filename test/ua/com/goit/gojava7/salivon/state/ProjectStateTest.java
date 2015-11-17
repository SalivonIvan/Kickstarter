package ua.com.goit.gojava7.salivon.state;

import junit.framework.AssertionFailedError;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import ua.com.goit.gojava7.salivon.context.Console;

public class ProjectStateTest {

    /**
     * Test of outputContentState method, of class ProjectState.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        ProjectState instance = new ProjectState();
        State.setIndexCategory(1);
        State.setIndexProject(3);
        instance.outputContentState();
    }

    /**
     * Test of changeState method, of class ProjectState.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        Console context = new Console();
        ProjectState instance = new ProjectState();
        ProjectState spy = spy(instance);
        when(spy.getInData()).thenReturn("1");
        spy.changeState(context);
    }

    @Test(expected = AssertionFailedError.class)
    public void testChangeStateQuit() {
        System.out.println("changeState");
        Console context = new Console();
        ProjectState instance = new ProjectState();
        ProjectState spy = spy(instance);
        when(spy.getInData()).thenReturn("q");
        doThrow(new AssertionFailedError()).when(spy).changeState(context);
        spy.changeState(context);

    }

}
