/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon;

import java.util.List;

/**
 *
 * @author Оля
 */
public class Console {

    private StringBuilder scene;
    private StoreCategories categories;
    private StoreProjects projects;
    private Quotes qutes;

    public Console() {
        scene = new StringBuilder();
        categories = new StoreCategories();
        projects = new StoreProjects();
        qutes = new Quotes();
    }

    public void print() {
        System.out.println(scene);
    }

    public void createWelcomScene() {
        if (scene.length() >= 1) {
            scene.delete(0, scene.length() - 1);
        }

        scene.append(qutes.getQuote() + "\n");
        scene.append(categories.getAllCategories());
        scene.append("--------------------------------------------------\n");
    }

    public void createCategoryScene(int idCategory) {
        scene.delete(0, scene.length() - 1);
        scene.append("Category - ");
        Category cat = categories.getCategory(idCategory);
        scene.append(cat.getId() + " " + cat.getName() + "\n");
        scene.append("Projects:\n");
        List<Project> list = projects.getProjects();
        for (Project list1 : list) {
            if (list1.getIdCategory()==idCategory) {
                scene.append(list1.getId()+" - "+list1.getTitle()+"\n");
                scene.append("Description: "+list1.getDescription()+"\n");
                scene.append("Total "+list1.getTotal()+"\n");
                scene.append("Collected amount "+list1.getCollectedAmount()+"\n");
                scene.append("Number of days to end "+list1.getNumberOfDaysToEnd()+"\n");
            }
        }
        scene.append("--------------------------------------------------\n");
    }

    public  void createProjectScene(int idProject) {
        scene.delete(0, scene.length() - 1);
        scene.append("Project\n");
        Project project = projects.getProject(idProject);
        scene.append(project.getTitle());
    }
}
