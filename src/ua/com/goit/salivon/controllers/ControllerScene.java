/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon.controllers;

import ua.com.goit.salivon.handlers.HandlerError;
import ua.com.goit.salivon.handlers.HandlerErrorFactory;
import ua.com.goit.salivon.scenes.SceneFactory;
import ua.com.goit.salivon.models.StateScene;
import ua.com.goit.salivon.scenes.ViewScene;
import ua.com.goit.salivon.stores.StoreProjects;
import ua.com.goit.salivon.stores.StoreCategories;
import ua.com.goit.salivon.view.Console;

/**
 *
 * @author Salivon Ivan
 */
public class ControllerScene {

    private StateScene state;
    private ViewScene scene;
    private String inData;
    private int indexProject;
    private StoreCategories categories;
    private StoreProjects projects;
    private int indexCategory;
    private Console console;

    public ControllerScene() {
        categories = new StoreCategories();
        projects = new StoreProjects();
        this.state = new StateScene();
        console = new Console();

    }

    public void launchProgram() {
        String inData = console.getInData();
        getViewScene(inData);
        console.execute(scene);
        launchProgram();
    }

    private void downloadScene() {
        SceneFactory factory = new SceneFactory();
        scene = factory.getViewScene(state, categories, projects, indexCategory, indexProject);
    }

    public void getViewScene(String inConsole) {
        defineInData(inConsole);
        verificationData();
        changeState();
        downloadScene();

    }

    private void defineInData(String in) {
        inData = in;
    }

    private void changeState() {
        if (!state.isError()) {
            processingOfData();
        }
    }

    private void processingOfData() {
        if (inData == null) {
            return;
        }
        int n = Integer.parseInt(inData);
        if (n == 0) {
            if (state.getCurrentState() == StateScene.CATEGORY_SCENE) {
                state.setCurrentState(StateScene.WELCOME_SCENE);
            }
            if (state.getCurrentState() == StateScene.PROJECT_SCENE) {
                state.setCurrentState(StateScene.CATEGORY_SCENE);

            }
        }
        if (n != 0) {
            if (state.getCurrentState() == StateScene.CATEGORY_SCENE) {
                state.setCurrentState(StateScene.PROJECT_SCENE);
                indexProject = n;

            }

            if (state.getCurrentState() == StateScene.WELCOME_SCENE) {
                state.setCurrentState(StateScene.CATEGORY_SCENE);
                indexCategory = n;

            }

        }
    }

    private void verificationData() {
        HandlerError hend = new HandlerErrorFactory().getHendlingError(state.getCurrentState(), categories, projects, indexCategory);
        if (!hend.validate(inData)) {
            state.setError(true);
            return;
        }
        if (state.isError()) {
            state.setError(false);
        }
    }
}
