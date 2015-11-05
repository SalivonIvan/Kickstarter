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
    private Quotes quotes;
    private int numScene;
    private int indexCategory;
    private int indexProject;

    public Console() {
        scene = new StringBuilder();
        categories = new StoreCategories();
        projects = new StoreProjects();
        quotes = new Quotes();
        numScene = 1;
    }

    public  void managerScene() {
        if (numScene == 1) {
            createWelcomScene();
            print();

        }
        if (numScene == 2) {
            createCategoryScene(indexCategory);
            print();

        }
        if (numScene == 3) {
            createProjectScene(indexProject);
            print();

        }
        reader();

    }

    private void reader() {
        Scanner scan = new Scanner(System.in);
        String line = scan.next();

        validate(line);
        managerScene();

    }

    private void validate(String str) {

        if (str.equals("q")) {
            System.exit(0);
        }
        int n = Integer.parseInt(str);
        if (n == 0) {
            if (numScene == 2) {
                numScene--;
            }
            if (numScene == 3) {
                numScene--;

            }
        }
        if (n != 0) {
            if (numScene == 2) {
                numScene++;
                indexProject = n;

            }

            if (numScene == 1) {
                numScene++;
                indexCategory = n;

            }

        }
    }

    private  void print() {
        System.out.println(scene);
    }

    private  void createWelcomScene() {
        if (scene.length() >= 1) {
            scene.delete(0, scene.length());
        }

        scene.append(quotes.getQuote() + "\n");
        scene.append(categories.getAllCategories());
        scene.append("--------------------------------------------------\n");
        scene.append("Enter number category or enter 'q' to exit." + "\n");
    }

    private  void createCategoryScene(int idCategory) {
        int index = idCategory-1;
        scene.delete(0, scene.length());
        scene.append("Category - ");
        Category cat = categories.getCategory(index);
        scene.append(cat.getId() + " " + cat.getName() + "\n\n");
        scene.append("Projects:\n");
        List<Project> list = projects.getProjects();
        for (Project list1 : list) {
            if (list1.getIdCategory() == index) {
                scene.append(list1.getId() + " - " + list1.getTitle() + "\n");
                scene.append("  Description: " + list1.getDescription() + "\n");
                scene.append("  Total " + list1.getTotal() + "\n");
                scene.append("  Collected amount " + list1.getCollectedAmount() + "\n");
                scene.append("  Number of days to end " + list1.getNumberOfDaysToEnd() + "\n\n");
            }
        }
        scene.append("--------------------------------------------------\n");
        scene.append("Enter number project or enter 'q' to exit,\nor enter 0 return to above." + "\n");
    }

    private  void createProjectScene(int idProject) {
        int index = idProject-1;
        scene.delete(0, scene.length());
        scene.append("Project\n");
        Project project = projects.getProject(index);
        scene.append(project.getTitle());
        scene.append("Enter 'q' to exit,\nor enter 0 return to above." + "\n");
    }
}
