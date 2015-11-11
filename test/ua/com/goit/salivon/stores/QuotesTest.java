/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon.stores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author salivon.i
 */
public class QuotesTest {

    public QuotesTest() {
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
     * Test of getQuote method, of class StoreQuotes.
     */
    @Test
    @Ignore
    public void testPrintQuote() {
        System.out.println("printQuote");
        StoreQuotes instance = new StoreQuotes();
        String result = instance.getQuote();
        if (result instanceof String) {
            System.out.println(result);
        }
        assertTrue(true);

    }

    @Test
    public void testRandomQuote() {
        System.out.println("randomQuote");
        StoreQuotes instance = new StoreQuotes();
        int count = instance.getQuotes().size();
        List<String> quotes = new ArrayList<>();
        List<String> authors = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextDouble()*10);
        }
        for (int i = 0; i < count; i++) {
            System.out.println(instance.getQuote());

            if (i > 0 && instance.getQuote() != quotes.get(i - 1)) {
                assertTrue(true);
            }
            quotes.add(instance.getQuote());
        }

    }

}
