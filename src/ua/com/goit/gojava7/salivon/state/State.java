package ua.com.goit.gojava7.salivon.state;

import java.util.Scanner;
import ua.com.goit.gojava7.salivon.ManagerData;
import ua.com.goit.gojava7.salivon.ManagerFileData;
import ua.com.goit.gojava7.salivon.ObjectDataManager;
import ua.com.goit.gojava7.salivon.handlers.ErrorHandler;
import ua.com.goit.gojava7.salivon.context.Console;

public abstract class State {

    private ManagerData managerData = new ObjectDataManager();
    protected static Scanner scan = new Scanner(System.in);
    protected String menu;
    protected ErrorHandler handler;
    private static int indexCategory;
    private static int indexProject;
    private boolean commandExit = true;
    private boolean commandZero = true;
    private static String inData;

    public abstract void outputContentState();

    public abstract void changeState(Console context);

    public ManagerData getManagerData() {
        return managerData;
    }

    public void setManagerData(ManagerData manager) {
        this.managerData = manager;
    }

    protected String getInData() {
        return inData;
    }

    public boolean isCommandZero() {
        return commandZero;
    }

    public void setCommandZero(boolean commandZero) {
        this.commandZero = commandZero;
    }

    public boolean isCommandExit() {
        return commandExit;
    }

    public void setCommandExit(boolean commandExit) {
        this.commandExit = commandExit;
    }

    public static Scanner getScan() {
        return scan;
    }

    public static int getIndexCategory() {
        return indexCategory;
    }

    public static void setIndexCategory(int indexCategory) {
        State.indexCategory = indexCategory;
    }

    public static int getIndexProject() {
        return indexProject;
    }

    public static void setIndexProject(int indexProject) {
        State.indexProject = indexProject;
    }

    public void verification() {

        while (true) {
            inData = readUserInformations().trim();
            if (inData.equalsIgnoreCase("q") && commandExit) {
                return;
            }
            if (inData.equals("0") && commandZero) {
                return;
            }
            if (!handler.validate(inData)) {
                System.out.println("Enter the correct data!");
                System.out.println(menu);
                continue;
            }
            return;
        }
    }

    public String readUserInformations() {
        String inData = State.scan.nextLine();
        return inData;
    }

    protected void performExit() {
        System.out.println("Goodbye my LORD!");
        State.getScan().close();
        Runtime.getRuntime().exit(0);
    }

    public void nextState(Console context) {
        context.execute();
    }

}
