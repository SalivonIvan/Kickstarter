/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon.handlers;

import java.util.List;
import ua.com.goit.salivon.beans.Category;
import ua.com.goit.salivon.handlers.HandlerError;
import ua.com.goit.salivon.state.State;
import ua.com.goit.salivon.stores.StoreCategories;

/**
 *
 * @author salivon.i
 */
public class HandlerErrorWelcomScene extends HandlerError {

    List<Category> categories = StoreCategories.getCategories();

    @Override
    public boolean validate(String inDate) {

        try {
            int n = Integer.parseInt(inDate);
            return n - 1 >= 0 && n - 1 < categories.size();
        } catch (NumberFormatException e) {
            if (inDate.equalsIgnoreCase("q")) {
                exit();
            }
            return false;
        }

    }

}
