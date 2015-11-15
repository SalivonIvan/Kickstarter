package ua.com.goit.gojava7.salivon.beans;

import org.junit.Test;
import static org.junit.Assert.*;

public class CategoryTest {

    Category instance = new Category("Art", 5);

    /**
     * Test of getId method, of class Category.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 5;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    /**
     * Test of setId method, of class Category.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        instance.setId(id);
        assertEquals(0, instance.getId());
    }

    /**
     * Test of getName method, of class Category.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Art";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setName method, of class Category.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Games";
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

}
