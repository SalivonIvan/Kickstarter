/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon.handlers;

import ua.com.goit.salivon.handlers.HandlerErrorCategoryScene;
import ua.com.goit.salivon.handlers.HandlerError;
import ua.com.goit.salivon.stores.StoreProjects;
import ua.com.goit.salivon.stores.StoreCategories;

/**
 *
 * @author salivon.i
 */
public class HandlerErrorFactory {

    public HandlerError getHendlingError(String stateScene, StoreCategories categories, StoreProjects projects, int index) {
        if (stateScene.equalsIgnoreCase("WELCOME")) {
            return new HandlerErrorWelcomScene(categories);
        } else if (stateScene.equalsIgnoreCase("CATEGORY")) {
            return new HandlerErrorCategoryScene(projects,index);
        } else if (stateScene.equalsIgnoreCase("PROJECT")) {
            return new HandlerErrorProjectScene();
        }
        return null;
    }
}
