/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon.scenes;

import ua.com.goit.salivon.models.StateScene;

/**
 *
 * @author Salivon Ivan
 */
public abstract class ViewScene {

    protected StringBuilder textScene = new StringBuilder();
    protected String menu;

    protected StringBuilder getScene() {
        return textScene;
    }

    public void process() {
        showScene();
        String line = readUserInformations();
        validate(line);
        StateScene.goToNext();
    }

    protected abstract void createScene();

    private String readUserInformations() {
       return "";
    }

    protected abstract void validate(String line);

    protected abstract void showScene();

}
