/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.handlers;

import java.util.List;
import ua.com.goit.gojava7.salivon.beans.Category;
import ua.com.goit.gojava7.salivon.handlers.ErrorHandler;
import ua.com.goit.gojava7.salivon.state.State;
import ua.com.goit.gojava7.salivon.stores.StoreCategories;

/**
 *
 * @author salivon.i
 */
public class ErrorHandlerStateWelcom implements ErrorHandler {

    List<Category> categories = StoreCategories.getCategories();

    @Override
    public boolean validate(String inData) {

        try {
            int n = Integer.parseInt(inData);
            return n - 1 >= 0 && n - 1 < categories.size();
        } catch (NumberFormatException e) {
            return false;
        }

    }

}
