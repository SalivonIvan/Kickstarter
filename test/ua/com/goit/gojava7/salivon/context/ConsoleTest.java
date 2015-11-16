package ua.com.goit.gojava7.salivon.context;

import org.junit.Test;
import static org.junit.Assert.*;
import ua.com.goit.gojava7.salivon.state.QuestionState;
import ua.com.goit.gojava7.salivon.state.State;
import static org.mockito.Mockito.*;

public class ConsoleTest {

    Console instance = new Console();

    /**
     * Test of getCurrentState method, of class Console.
     */
    @Test
    public void testGetCurrentState() {
        System.out.println("getCurrentState");
        State result = instance.getCurrentState();
        assertTrue(result instanceof State);

    }

    /**
     * Test of setCurrentState method, of class Console.
     */
    @Test
    public void testSetCurrentState() {
        System.out.println("setCurrentState");
        State currentState = new QuestionState();
        instance.setCurrentState(currentState);
        assertEquals(currentState, instance.getCurrentState());

    }

    /**
     * Test of outputContentState method, of class Console.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        State state = mock(State.class);
        instance.setCurrentState(state);
        instance.outputContentState();
        verify(state).outputContentState();
    }

    /**
     * Test of verification method, of class Console.
     */
    @Test
    public void testVerification() {
        System.out.println("verification");
        State state = mock(State.class);
        instance.setCurrentState(state);
        instance.verification();
        verify(state).verification(instance);

    }

    /**
     * Test of execute method, of class Console.
     */
    @Test(expected = StackOverflowError.class)
    public void testExecute() {
        System.out.println("execute");
        State state = mock(State.class);
        Console inst = spy(instance);
        inst.setCurrentState(state);
        inst.execute();
        verify(inst).outputContentState();
        verify(inst).verification();
        verify(inst).execute();

    }

}
