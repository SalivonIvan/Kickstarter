/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.beans;

/**
 *
 * @author salivon.i
 */
public class Category {

    private int id;
    private String name;

    public Category(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
