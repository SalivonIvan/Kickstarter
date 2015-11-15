package ua.com.goit.gojava7.salivon.beans;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProjectTest {

    Project instance = new Project("Art", 100, 1, 1);

    /**
     * Test of getDateStart method, of class Project.
     */
    @Test
    public void testGetDateStart() {
        System.out.println("getDateStart");
        assertNotNull(instance.getDateStart());

    }

    /**
     * Test of getIdCategory method, of class Project.
     */
    @Test
    public void testGetIdCategory() {
        System.out.println("getIdCategory");
        int expResult = 1;
        int result = instance.getIdCategory();
        assertEquals(expResult, result);

    }

    /**
     * Test of setIdCategory method, of class Project.
     */
    @Test
    public void testSetIdCategory() {
        System.out.println("setIdCategory");
        int idCategory = 2;
        instance.setIdCategory(idCategory);
        assertEquals(2, instance.getIdCategory());
    }

    /**
     * Test of getTitle method, of class Project.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Art";
        String result = instance.getTitle();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTitle method, of class Project.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "Games";
        instance.setTitle(title);
        assertEquals(title, instance.getTitle());
    }

    /**
     * Test of getDescription method, of class Project.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "...description...";
        String result = instance.getDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDescription method, of class Project.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        instance.setDescription(description);
        assertEquals("", instance.getDescription());
    }

    /**
     * Test of getTotal method, of class Project.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int expResult = 100;
        int result = instance.getTotal();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTotal method, of class Project.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 10;
        instance.setTotal(total);
        assertEquals(10, instance.getTotal());

    }

    /**
     * Test of getNumberOfDaysToImplement method, of class Project.
     */
    @Test
    public void testGetNumberOfDaysToImplement() {
        System.out.println("getNumberOfDaysToImplement");
        int expResult = 0;
        int result = instance.getNumberOfDaysToImplement();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNumberOfDaysToImplement method, of class Project.
     */
    @Test
    public void testSetNumberOfDaysToImplement() {
        System.out.println("setNumberOfDaysToImplement");
        int numberOfDaysToImplement = 10;
        instance.setNumberOfDaysToImplement(numberOfDaysToImplement);
        assertEquals(10, instance.getNumberOfDaysToImplement());
    }

    /**
     * Test of getHistoryProject method, of class Project.
     */
    @Test
    public void testGetHistoryProject() {
        System.out.println("getHistoryProject");
        String expResult = "...history...";
        String result = instance.getHistoryProject();
        assertEquals(expResult, result);

    }

    /**
     * Test of setHistoryProject method, of class Project.
     */
    @Test
    public void testSetHistoryProject() {
        System.out.println("setHistoryProject");
        String historyProject = "";
        instance.setHistoryProject("");
        assertEquals("", instance.getHistoryProject());
    }

    /**
     * Test of getLink method, of class Project.
     */
    @Test
    public void testGetLink() {
        System.out.println("getLink");
        String expResult = "...link...";
        String result = instance.getLink();
        assertEquals(expResult, result);

    }

    /**
     * Test of setLink method, of class Project.
     */
    @Test
    public void testSetLink() {
        System.out.println("setLink");
        String link = "";
        instance.setLink(link);
        assertEquals("", instance.getLink());
    }

    /**
     * Test of getCollectedAmount method, of class Project.
     */
    @Test
    public void testGetCollectedAmount() {
        System.out.println("getCollectedAmount");
        int expResult = 0;
        int result = instance.getCollectedAmount();
        assertEquals(expResult, result);

    }

    /**
     * Test of setCollectedAmount method, of class Project.
     */
    @Test
    public void testSetCollectedAmount() {
        System.out.println("setCollectedAmount");
        instance.setCollectedAmount(20);
        int result1 = instance.getCollectedAmount();
        instance.setCollectedAmount(5);
        int result2 = instance.getCollectedAmount();
        assertEquals(20, result1);
        assertEquals(25, result2);
    }

    /**
     * Test of getFaq method, of class Project.
     */
    @Test
    public void testGetFaq() {
        System.out.println("getFaq");
        String expResult = "...FAQ...";
        String result = instance.getFaq();
        assertEquals(expResult, result);

    }

    /**
     * Test of setFaq method, of class Project.
     */
    @Test
    public void testSetFaq() {
        System.out.println("setFaq");
        instance.setFaq("");
        String result1 = instance.getFaq();

        instance.setFaq("Hello");
        String result2 = instance.getFaq();
        assertEquals("...FAQ...\n", result1);
        assertEquals("...FAQ...\nHello\n", result2);
    }

    /**
     * Test of getId method, of class Project.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetId() {
        System.out.println("setId");
        instance.setId(2);
        assertEquals(2, instance.getId());

    }

    /**
     * Test of getNumberOfDaysToEnd method, of class Project.
     */
    @Test
    public void testGetNumberOfDaysToEnd() {
        System.out.println("getNumberOfDaysToEnd");
        int expResult = 0;
        int result = instance.getNumberOfDaysToEnd();
        assertEquals(expResult, result);

    }

}
