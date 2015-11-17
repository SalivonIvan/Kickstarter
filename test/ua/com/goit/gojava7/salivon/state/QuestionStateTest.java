package ua.com.goit.gojava7.salivon.state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import ua.com.goit.gojava7.salivon.context.Console;

public class QuestionStateTest {

    /**
     * Test of outputContentState method, of class QuestionState.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        QuestionState instance = new QuestionState();
        instance.outputContentState();

    }

    /**
     * Test of changeState method, of class QuestionState.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        Console context = new Console();
        QuestionState instance = new QuestionState();
        QuestionState spy = spy(instance);
        State.setIndexProject(5);
        when(spy.getInData()).thenReturn("Hello????");
        spy.changeState(context);
    }

}
