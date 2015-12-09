package ua.com.goit.gojava7.salivon.state;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.goit.gojava7.salivon.context.Console;
import ua.com.goit.gojava7.salivon.context.StringDataType;
import ua.com.goit.gojava7.salivon.dao.DataType;

public class PreloadingState extends State {

    public PreloadingState() {
        menu = "Select data source:\n"
                + "- enter 1 - data from the file system\n"
                + "- enter 2 - data of the object model\n"
                + "- enter 3 - data of the DB model\n";
        setCommandZero(false);
        setCommandExit(false);
    }
//When you select mode from the command console

//    @Override
//    public void outputContentState() {
//        System.out.println("--------------------------------------------------");
//        System.out.println(menu);
//    }
//
//    @Override
//    public boolean validate(String data) {
//        try {
//            int n = Integer.parseInt(data);
//
//            return n == 1 || n == 2 || n == 3;
//
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }
//
//    @Override
//    public void changeState(Console context) {
//        int inDateToInt = Integer.parseInt(getInData());
//        selectCurrentData(inDateToInt);
//        context.setCurrentState(new WelcomeState());
//    }
//
//    protected void selectCurrentData(int inData) {
//        switch (inData) {
//
//            case 1:
//                setCurrentDataType(DataType.FILE);
//                break;
//            case 2:
//                setCurrentDataType(DataType.MEMORY);
//                break;
//            case 3:
//                setCurrentDataType(DataType.DB);
//                break;
//        }
//
//    }

//When you select mode the SystemProperties of
    @Override
    public void outputContentState() {

    }
     @Override
    public boolean validate(String data) {
       return true;      
    }
    @Override
    public void changeState(Console context) {
        ApplicationContext contextSpring = new ClassPathXmlApplicationContext("context.xml");
        StringDataType obj = (StringDataType) contextSpring.getBean("stringDataType");
        String inData = obj.getDataType();
//        if (!inData.equalsIgnoreCase("file")||!inData.equalsIgnoreCase("memory")||!inData.equalsIgnoreCase("db")) {
//            performExit();
//        }
        selectCurrentData(inData);
        context.setCurrentState(new WelcomeState());
    }

    protected void selectCurrentData(String inData) {
        switch (inData) {

            case "file":
                setCurrentDataType(DataType.FILE);
                break;
            case "memory":
                setCurrentDataType(DataType.MEMORY);
                break;
            case "db":
                setCurrentDataType(DataType.DB);
                break;
        }

    }

    @Override
    protected void performExit() {
       System.out.println("Goodbye my LORD!");
       System.out.println("Enter the correct data - <-Dmode=file|memory|db>");
        State.getScan().close();
        Runtime.getRuntime().exit(0);
    }

    @Override
    public void verification() {
     
    }
    
}
