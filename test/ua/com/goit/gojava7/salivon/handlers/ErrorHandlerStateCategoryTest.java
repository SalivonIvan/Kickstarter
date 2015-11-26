package ua.com.goit.gojava7.salivon.handlers;

import org.junit.Test;
import static org.junit.Assert.*;
import ua.com.goit.gojava7.salivon.dao.ManagerFileData;
import ua.com.goit.gojava7.salivon.state.State;

public class ErrorHandlerStateCategoryTest {


    @Test
    public void testValidate() {
        State.setIdProject(1);
        State.setIdCategory(1);
        ErrorHandlerStateCategory instance = new ErrorHandlerStateCategory(new ManagerFileData());
        assertEquals(false, instance.validate(""));
        assertEquals(false, instance.validate("0"));
        assertEquals(true, instance.validate("1"));

    }
    

}
