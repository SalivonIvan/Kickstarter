package ua.com.goit.gojava7.salivon.state;

import junit.framework.AssertionFailedError;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ua.com.goit.gojava7.salivon.context.Console;
import static org.mockito.Mockito.*;
import ua.com.goit.gojava7.salivon.dao.DataType;

public class WelcomeStateTest {

    @Test
    public void testOutputContentStateForFile() {
        State.setCurrentDataType(DataType.FILE);
        WelcomeState instance = new WelcomeState();
        instance.outputContentState();

    }

    @Test
    public void testChangeStateForFile() {
        State.setCurrentDataType(DataType.FILE);
        Console context = new Console();
        WelcomeState instance = new WelcomeState();
        WelcomeState spy = spy(instance);
        when(spy.getInData()).thenReturn("1");
        spy.changeState(context);

    }

    @Test(expected = AssertionFailedError.class)
    public void testChangeStateQuitForFile() {
        State.setCurrentDataType(DataType.FILE);
        Console context = new Console();
        WelcomeState instance = new WelcomeState();
        WelcomeState spy = spy(instance);
        when(spy.getInData()).thenReturn("q");
        doThrow(new AssertionFailedError()).when(spy).changeState(context);
        spy.changeState(context);

    }

    @Test
    public void testOutputContentStateForMemory() {
        State.setCurrentDataType(DataType.MEMORY);
        WelcomeState instance = new WelcomeState();
        instance.outputContentState();

    }

    @Test
    public void testChangeStateForMemory() {
        State.setCurrentDataType(DataType.MEMORY);
        Console context = new Console();
        WelcomeState instance = new WelcomeState();
        WelcomeState spy = spy(instance);
        when(spy.getInData()).thenReturn("1");
        spy.changeState(context);

    }

    @Test(expected = AssertionFailedError.class)
    public void testChangeStateQuitForMemory() {
        State.setCurrentDataType(DataType.MEMORY);
        Console context = new Console();
        WelcomeState instance = new WelcomeState();
        WelcomeState spy = spy(instance);
        when(spy.getInData()).thenReturn("q");
        doThrow(new AssertionFailedError()).when(spy).changeState(context);
        spy.changeState(context);

    }

    @Test
    public void testValidateForFile() {
        State.setCurrentDataType(DataType.FILE);
        State.setIdProject(1);
        State.setIdCategory(1);
        WelcomeState instance = new WelcomeState();
        assertEquals(false, instance.validate(""));
        assertEquals(true, instance.validate("1"));
        assertEquals(false, instance.validate("200"));
        assertEquals(true, instance.validate("2"));
        assertEquals(false, instance.validate("0"));
    }

    @Test
    public void testValidateForMemory() {
        State.setCurrentDataType(DataType.MEMORY);
        State.setIdProject(1);
        State.setIdCategory(1);
        WelcomeState instance = new WelcomeState();
        assertEquals(false, instance.validate(""));
        assertEquals(true, instance.validate("1"));
        assertEquals(false, instance.validate("200"));
        assertEquals(true, instance.validate("2"));
        assertEquals(false, instance.validate("0"));
    }
}
