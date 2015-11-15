package ua.com.goit.gojava7.salivon.stores;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import ua.com.goit.gojava7.salivon.beans.Project;

public class StoreProjectsTest {

    /**
     * Test of getProjects method, of class StoreProjects.
     */
    @Test
    public void testGetProjects() {
        System.out.println("getProjects");
        List<Project> result = StoreProjects.getProjects();
        assertTrue(result instanceof List);
    }

}
