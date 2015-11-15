package ua.com.goit.gojava7.salivon.beans;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuoteTest {

    Quote instance = new Quote("Hello!", "Petro");

    /**
     * Test of getText method, of class Quote.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        String expResult = "Hello!";
        String result = instance.getText();
        assertEquals(expResult, result);

    }

    /**
     * Test of setText method, of class Quote.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "World!";
        instance.setText(text);
        assertEquals(text, instance.getText());
    }

    /**
     * Test of getAutor method, of class Quote.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        String expResult = "Petro";
        String result = instance.getAutor();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAutor method, of class Quote.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "Ivan";
        instance.setAutor(autor);
        assertEquals(autor, instance.getAutor());

    }

}
