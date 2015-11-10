/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon.scenes;

import ua.com.goit.salivon.handlers.HandlerError;
import ua.com.goit.salivon.handlers.HandlerErrorFactory;
import ua.com.goit.salivon.scenes.ViewScene;
import ua.com.goit.salivon.stores.Quotes;
import ua.com.goit.salivon.stores.StoreCategories;

/**
 *
 * @author Salivon Ivan
 */
public class WelcomeScene extends ViewScene {

    private StoreCategories categories;
    private Quotes quotes;
    private HandlerError validator = new HandlerErrorFactory().;

    public WelcomeScene(StoreCategories store) {
        quotes = new Quotes();
        categories = store;
        menu = "Enter the number of categories to select it.\n"
                + "Enter 'q' to exit.\n";
        createScene();

    }

    @Override
    protected void createScene() {

    }

    @Override
    protected void validate(String line) {
        validator.validate(line);
    }

    @Override
    protected void showScene() {
        System.out.println((quotes.getQuote() + "\n"));
        System.out.println(categories.getAllCategories());
        System.out.println("--------------------------------------------------\n");
        System.out.println(menu);
    }
}
