package ua.com.goit.gojava7.salivon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import ua.com.goit.gojava7.salivon.beans.Category;
import ua.com.goit.gojava7.salivon.beans.Project;

public class ManagerFileData implements ManagerData {

    private static final String PATH_TO_QUOTE = "quote.csv";
    private static final String PATH_TO_CATEGORY = "category.csv";
    private static final String PATH_TO_PROJECT = "project.csv";

    @Override
    public String getRandomQuote() {

        Random random = new Random();
        String quote = null;
        File file = new File(PATH_TO_QUOTE);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.mark((int) file.length() + 1);
            int count = 0;
            while ((quote = br.readLine()) != null) {
                count++;
            }
            int number = (int) (random.nextDouble() * count);
            br.reset();
            while (true) {
                quote = br.readLine();
                if (number == 0) {
                    String[] arr = quote.split("[|]");
                    quote = arr[0] + "\n Autor:" + arr[1];
                    break;
                } else {
                    number--;
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(ManagerFileData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quote;
    }

    @Override
    public List<Category> getAllCategories() {

        List<Category> categories = new ArrayList<>();
        File file = new File(PATH_TO_CATEGORY);
        String category = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((category = br.readLine()) != null) {
                String[] arr = category.split("[|]");
                int id = Integer.parseInt(arr[0].trim());
                String name = arr[1].trim();
                categories.add(new Category(name, id));
            }

        } catch (IOException ex) {
            Logger.getLogger(ManagerFileData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }

    @Override
    public Category getCategory(int idCategory) {
        Category requestedCategory = null;
        File file = new File(PATH_TO_CATEGORY);
        String category = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((category = br.readLine()) != null) {
                String[] arr = category.split("[|]");
                int id = Integer.parseInt(arr[0].trim());
                String name = arr[1].trim();
                if (id == idCategory) {
                    requestedCategory = new Category(name, id);
                    break;
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(ManagerFileData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return requestedCategory;
    }

    @Override
    public List<Project> getProjectsOfCategory(int idCategory) {
        List<Project> projects = new ArrayList<>();
        File file = new File(PATH_TO_PROJECT);
        String project = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((project = br.readLine()) != null) {
                String[] arr = project.split("[|]");
                int id = Integer.parseInt(arr[0].trim());
                String title = arr[1].trim();
                int total = Integer.parseInt(arr[2].trim());
                int idCategoryOfProject = Integer.parseInt(arr[3].trim());
                if (idCategoryOfProject==idCategory) {
                    projects.add(new Project(title, total, idCategoryOfProject, id));
                }
                
            }

        } catch (IOException ex) {
            Logger.getLogger(ManagerFileData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return projects;
    }

    @Override
    public Project getProject(int idProject) {
        Project requestedProject = null;
        File file = new File(PATH_TO_PROJECT);
        String project = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((project = br.readLine()) != null) {
                String[] arr = project.split("[|]");
                int id = Integer.parseInt(arr[0].trim());
                String title = arr[1].trim();
                int total = Integer.parseInt(arr[2].trim());
                int idCategory = Integer.parseInt(arr[3].trim());
                if (id == idProject) {
                    requestedProject = new Project(title, total, idCategory, id);
                    break;
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(ManagerFileData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return requestedProject;
    }
}
