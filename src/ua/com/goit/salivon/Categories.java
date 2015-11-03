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
public class Categories {

    List<String> categories = new ArrayList<>();

    {
        categories.add("Art");
        categories.add("Comics");
        categories.add("Games");

    }

    public String getAllCategories() {
        String str = "Categories:\n";
        for (int i = 0; i < categories.size(); i++) {
            str += i + " - " + categories.get(i) + "\n";
        }
        return str;
    }
}
