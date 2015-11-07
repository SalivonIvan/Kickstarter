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
public class ControllerScene {

    StateScene state;
    String currentState;

    public ControllerScene() {
        this.state = new StateScene();
    }

    private void defineState() {
        currentState = state.getCurrentState();
    }

    public StringBuilder getAnswer(String in) {
        return new StringBuilder();
    }

    private void defineInData(String in) {

    }
}
