/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Оля
 */
public class StoreCategories {

    List<Category> categories = new ArrayList<>();

    {
        categories.add(new Category("Art"));
        categories.add(new Category("Comics"));
        categories.add(new Category("Games"));
    }

    public void addCategory(Category project) {
        categories.add(project);
    }

    public void removeCategory(int idCategory) {
//        categories.remove(idCategory);
    }

    public Category getCategory(int idCategory) {
        return categories.get(idCategory);
    }

    public String getAllCategories() {
        String str = "Categories:\n";
        for (int i = 0; i < categories.size(); i++) {
            str += categories.get(i).getId() + " - " + categories.get(i).getName() + "\n";
        }
        return str;
    }
}
