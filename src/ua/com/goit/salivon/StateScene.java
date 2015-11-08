/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon;

/**
 *
 * @author Salivon Ivan
 */
public class StateScene {

    private static final String WELCOME_SCENE = "WELCOME";
    private static final String CATEGORY_SCENE = "CATEGORY";
    private static final String PROJECT_SCENE = "PROJECT";
    private String currentState;
    private boolean hasError;

    public StateScene() {
        this.currentState = WELCOME_SCENE;
        hasError = true;
    }

    public String getCurrentState() {
        return currentState;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }
    

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

}
