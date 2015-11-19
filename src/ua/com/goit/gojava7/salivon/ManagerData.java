/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon;

import java.util.List;
import ua.com.goit.gojava7.salivon.beans.Category;
import ua.com.goit.gojava7.salivon.beans.Faq;
import ua.com.goit.gojava7.salivon.beans.Project;

/**
 *
 * @author Salivon Ivan
 */
public interface ManagerData {

    String getRandomQuote();

    List<Category> getAllCategories();

    Category getCategory(int idCategory);

    List<Project> getProjectsOfCategory(int idCategory);

    Project getProject(int idProject);

    void saveFaq(Faq faq);

    String getFaq(int idProject);
}
