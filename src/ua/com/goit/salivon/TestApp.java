/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon;

/**
 *
 * @author Оля
 */
public class TestApp {

    public static void main(String[] args) {
        Quotes q = new Quotes();
        Categories categories = new Categories();

        Console console = new Console();
        console.print(q.getQuote());
        console.print(categories.getAllCategories());
    }

}
