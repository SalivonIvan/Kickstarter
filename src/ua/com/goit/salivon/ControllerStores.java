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
public class ControllerStores {
    private  StoreCategories categories;
    private StoreProjects projects;

    public ControllerStores(StoreCategories categories, StoreProjects projects) {
        this.categories = categories;
        this.projects = projects;
    }

    public StoreCategories getCategories() {
        return categories;
    }

    public void setCategories(StoreCategories categories) {
        this.categories = categories;
    }

    public StoreProjects getProjects() {
        return projects;
    }

    public void setProjects(StoreProjects projects) {
        this.projects = projects;
    }
    
}
