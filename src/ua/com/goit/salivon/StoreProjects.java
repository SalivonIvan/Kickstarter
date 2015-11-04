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
 * @author salivon.i
 */
public class StoreProjects {

    private  List<Project> projects = new ArrayList<>();

    public void addProject(Project project) {
        projects.add(project);
    }

    public void removeProject(Project project) {
        projects.remove(project);
    }
    public Project getProject(int index){
        return projects.get(index);
    }
}
