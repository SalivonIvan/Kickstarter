/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Оля
 */
public class Console {

    private StringBuilder scene;
    private StoreCategories categories;
    private StoreProjects projects;
    private Quotes qutes;
    private int numScene;
    private int index;

    public Console() {
        scene = new StringBuilder();
        categories = new StoreCategories();
        projects = new StoreProjects();
        qutes = new Quotes();
        numScene = 1;
    }

    void managerScene() {
        if (numScene == 1) {
            createWelcomScene();
            print();
            reader();
            managerScene();
        }
        if (numScene == 2) {
            createCategoryScene(index);
            print();
             reader();
            managerScene();
        }
        if (numScene == 3) {
            createProjectScene(index);
            print();
             reader();
            managerScene();
        }
    }

    public void reader() {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        if (scan.hasNext()) {
            if (scan.nextLine().equals("q")) {
                System.exit(0);
            }
        }
        if (scan.nextInt()==0) {
            if (numScene==2) {
                numScene--;
                scan.close();
            }
            if (numScene==3) {
                numScene--;
                scan.close();
            }
        }
        if (scan.nextInt()!=0) {
            if (numScene==1) {
                numScene++;
                index=scan.nextInt();
                scan.close();
                return;
            }
            if (numScene==2) {
                numScene++;
                index=scan.nextInt();
                scan.close();
            }
        }
        
    }

    public void print() {
        System.out.println(scene);
    }

    public void createWelcomScene() {
        if (scene.length() >= 1) {
            scene.delete(0, scene.length());
        }

        scene.append(qutes.getQuote() + "\n");
        scene.append(categories.getAllCategories());
        scene.append("--------------------------------------------------\n");
        scene.append("Enter number category or enter 'q' to exit." + "\n");
    }

    public void createCategoryScene(int idCategory) {
        scene.delete(0, scene.length());
        scene.append("Category - ");
        Category cat = categories.getCategory(idCategory);
        scene.append(cat.getId() + " " + cat.getName() + "\n");
        scene.append("Projects:\n");
        List<Project> list = projects.getProjects();
        for (Project list1 : list) {
            if (list1.getIdCategory() == idCategory) {
                scene.append(list1.getId() + " - " + list1.getTitle() + "\n");
                scene.append("Description: " + list1.getDescription() + "\n");
                scene.append("Total " + list1.getTotal() + "\n");
                scene.append("Collected amount " + list1.getCollectedAmount() + "\n");
                scene.append("Number of days to end " + list1.getNumberOfDaysToEnd() + "\n");
            }
        }
        scene.append("--------------------------------------------------\n");
        scene.append("Enter number project or enter 'q' to exit,\nor enter 0 return to above." + "\n");
    }

    public void createProjectScene(int idProject) {
        scene.delete(0, scene.length());
        scene.append("Project\n");
        Project project = projects.getProject(idProject);
        scene.append(project.getTitle());
        scene.append("Enter 'q' to exit,\nor enter 0 return to above." + "\n");
    }
}
