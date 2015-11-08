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
public class WelcomeScene extends ViewScene {

    private ControllerStores controller;
    private StoreCategories categories;
    private Quotes quotes;

    public WelcomeScene(ControllerStores controller, String inData) {
        this.controller = controller;
        categories = controller.getCategories();
        hendling = new HendlingErrorWelcomScene(categories);
        this.inData = inData;
        menu = "Enter the number of categories to select it.\n"
                + "Enter 'q' to exit.\n";
        errorMessages = "Enter the correct data!";
    }

    @Override
    public void createScene() {

        textScene.append(quotes.getQuote() + "\n");
        textScene.append(categories.getAllCategories());
        textScene.append("--------------------------------------------------\n");
        textScene.append(menu);
        if (true) {
            
        }

    }

}
