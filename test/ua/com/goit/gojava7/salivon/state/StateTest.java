
package ua.com.goit.gojava7.salivon.state;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
import ua.com.goit.gojava7.salivon.context.Console;
import static org.mockito.Mockito.*;
import ua.com.goit.gojava7.salivon.handlers.ErrorHandler;

public class StateTest {

    /**
     * Test of outputContentState method, of class State.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        State instance = new StateImpl();
        instance.outputContentState();
        
    }

    /**
     * Test of changeState method, of class State.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        Console context = new Console();
        State instance = new StateImpl();
        instance.changeState(context);

    }

    /**
     * Test of getInData method, of class State.
     */
    @Test
    public void testGetInData() {
        System.out.println("getInData");
        State instance = new StateImpl();
        State inst = spy(instance);
        when(inst.readUserInformations()).thenReturn("q");
        inst.verification();
        String expResult = "q";
        String result = instance.getInData();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isCommandZero method, of class State.
     */
    @Test
    public void testIsCommandZero() {
        System.out.println("isCommandZero");
        State instance = new StateImpl();
        boolean expResult = true;
        boolean result = instance.isCommandZero();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCommandZero method, of class State.
     */
    @Test
    public void testSetCommandZero() {
        System.out.println("setCommandZero");
        boolean commandZero = false;
        State instance = new StateImpl();
        instance.setCommandZero(commandZero);
        assertEquals(false, instance.isCommandZero());
       
    }

    /**
     * Test of isCommandExit method, of class State.
     */
    @Test
    public void testIsCommandExit() {
        System.out.println("isCommandExit");
        State instance = new StateImpl();
        boolean expResult = true;
        boolean result = instance.isCommandExit();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCommandExit method, of class State.
     */
    @Test
    public void testSetCommandExit() {
        System.out.println("setCommandExit");
        boolean commandExit = false;
        State instance = new StateImpl();
        instance.setCommandExit(commandExit);
        assertEquals(false, instance.isCommandExit());
     
    }

    /**
     * Test of getScan method, of class State.
     */
    @Test
    public void testGetScan() {
        System.out.println("getScan");
        Scanner expResult = null;
        Scanner result = State.getScan();
        assertNotNull(result);
     
    }

    /**
     * Test of getIndexCategory method, of class State.
     */
    @Test
    public void testGetIndexCategory() {
        System.out.println("getIndexCategory");
        int expResult = 2;
        State.setIndexCategory(expResult);
        int result = State.getIndexCategory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIndexCategory method, of class State.
     */
    @Test
    public void testSetIndexCategory() {
        System.out.println("setIndexCategory");
        int indexCategory = 10;
        State.setIndexCategory(indexCategory);
        assertEquals(10, State.getIndexCategory());
               
       
    }

    /**
     * Test of getIndexProject method, of class State.
     */
    @Test
    public void testGetIndexProject() {
        System.out.println("getIndexProject");
        int expResult = 5;
        State.setIndexProject(expResult);
        int result = State.getIndexProject();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setIndexProject method, of class State.
     */
    @Test
    public void testSetIndexProject() {
        System.out.println("setIndexProject");
        int indexProject = 0;
        State.setIndexProject(indexProject);
        assertEquals(0, State.getIndexProject());
    }

    /**
     * Test of verification method, of class State.
     */
    @Test
    public void testVerification() {
        System.out.println("verification");
        State instance = new StateImpl();
        ErrorHandler mock = mock(ErrorHandler.class);
        State spy = spy(instance);
        spy.handler = mock;
        spy.setCommandExit(true);
        when(mock.validate(anyString())).thenReturn(true);
        doReturn("q").when(spy).readUserInformations();
        spy.verification();
        doReturn("0").when(spy).readUserInformations();
        spy.verification();
        doReturn("1").when(spy).readUserInformations();
        spy.verification();
//         doReturn("q").when(spy).readUserInformations();
//         spy.setCommandExit(false);
//        spy.verification();
//        doReturn("0").when(spy).readUserInformations();
//        spy.setCommandZero(false);
//        spy.verification();
        
    }

    /**
     * Test of readUserInformations method, of class State.
     */
    @Test
    public void testReadUserInformations() {
        System.out.println("readUserInformations");
        State instance = new StateImpl();
        String expResult = "";
        String result = instance.readUserInformations();
        assertNotNull(result);
        
    }

    /**
     * Test of performExit method, of class State.
     */
    @Test
    public void testPerformExit() {
        System.out.println("performExit");
        State instance = new StateImpl();
//        instance.performExit();
        
    }

    /**
     * Test of nextState method, of class State.
     */
    @Test
    public void testNextState() {
        System.out.println("nextState");
        Console context = mock(Console.class);
        State instance = new StateImpl();
        instance.nextState(context);
        verify(context).execute();
        
    }

    public class StateImpl extends State {

        public void outputContentState() {
        }

        public void changeState(Console context) {
        }
    }

}
