package ua.com.goit.gojava7.salivon.stores;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ua.com.goit.gojava7.salivon.beans.Quote;

public class StoreQuotesTest {

    StoreQuotes instance = new StoreQuotes();

    /**
     * Test of getQuotes method, of class StoreQuotes.
     */
    @Test
    public void testGetQuotes() {
        System.out.println("getQuotes");
        List<Quote> result = instance.getQuotes();
        assertNotNull(result);

    }

    /**
     * Test of setQuotes method, of class StoreQuotes.
     */
    @Test
    public void testSetQuotes() {
        System.out.println("setQuotes");
        List<Quote> quotes = new ArrayList<>();
        instance.setQuotes(quotes);
        assertEquals(quotes, instance.getQuotes());
    }

    /**
     * Test of getRandomQuote method, of class StoreQuotes.
     */
    @Test
    public void testGetRandomQuote() {
        System.out.println("getRandomQuote");
        String result = StoreQuotes.getRandomQuote();
        String resultN;
        while (true) {
            resultN = StoreQuotes.getRandomQuote();
            if (!result.equals(resultN)) {
                break;
            }
        }
        assertFalse(result.equals(resultN));

    }

}
