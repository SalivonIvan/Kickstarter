/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.state;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ua.com.goit.gojava7.salivon.context.Console;

/**
 *
 * @author Salivon Ivan
 */
public class StateTest {
    
    public StateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of outputContentState method, of class State.
     */
    @Test
    public void testOutputContentState() {
        System.out.println("outputContentState");
        State instance = new WelcomeState();
        instance.outputContentState();
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeState method, of class State.
     */
    @Test
    public void testChangeState() {
        System.out.println("changeState");
        Console context = null;
        String inData = "";
        State instance = new StateImpl();
        instance.changeState(context, inData);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCommandZero method, of class State.
     */
    @Test
    public void testIsCommandZero() {
        System.out.println("isCommandZero");
        State instance = new StateImpl();
        boolean expResult = false;
        boolean result = instance.isCommandZero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCommandExit method, of class State.
     */
    @Test
    public void testIsCommandExit() {
        System.out.println("isCommandExit");
        State instance = new StateImpl();
        boolean expResult = false;
        boolean result = instance.isCommandExit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScan method, of class State.
     */
    @Test
    public void testGetScan() {
        System.out.println("getScan");
        Scanner expResult = null;
        Scanner result = State.getScan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexCategory method, of class State.
     */
    @Test
    public void testGetIndexCategory() {
        System.out.println("getIndexCategory");
        int expResult = 0;
        int result = State.getIndexCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndexCategory method, of class State.
     */
    @Test
    public void testSetIndexCategory() {
        System.out.println("setIndexCategory");
        int indexCategory = 0;
        State.setIndexCategory(indexCategory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndexProject method, of class State.
     */
    @Test
    public void testGetIndexProject() {
        System.out.println("getIndexProject");
        int expResult = 0;
        int result = State.getIndexProject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIndexProject method, of class State.
     */
    @Test
    public void testSetIndexProject() {
        System.out.println("setIndexProject");
        int indexProject = 0;
        State.setIndexProject(indexProject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verification method, of class State.
     */
    @Test
    public void testVerification() {
        System.out.println("verification");
        Console context = null;
        State instance = new StateImpl();
        instance.verification(context);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performExit method, of class State.
     */
    @Test
    public void testPerformExit() {
        System.out.println("performExit");
        State instance = new StateImpl();
        instance.performExit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class StateImpl extends State {

        public void outputContentState() {
        }

        public void changeState(Console context, String inData) {
        }
    }
    
}
