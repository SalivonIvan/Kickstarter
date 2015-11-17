package ua.com.goit.gojava7.salivon.state;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import ua.com.goit.gojava7.salivon.context.Console;

public class ContributionAmountStateTest {

    /**
     * Test of outputContentState method, of class ContributionAmountState.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        ContributionAmountState instance = new ContributionAmountState();
        instance.outputContentState();
        
    }

    /**
     * Test of changeState method, of class ContributionAmountState.
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

}
