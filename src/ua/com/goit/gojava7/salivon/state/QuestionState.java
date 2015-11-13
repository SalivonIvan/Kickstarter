/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.state;

import java.util.List;
import ua.com.goit.gojava7.salivon.beans.Project;
import ua.com.goit.gojava7.salivon.context.Console;
import ua.com.goit.gojava7.salivon.handlers.ErrorHandlerStateQuestion;
import ua.com.goit.gojava7.salivon.stores.StoreProjects;

/**
 *
 * @author Salivon Ivan
 */
public class QuestionState extends State {

    List<Project> projects = StoreProjects.getProjects();

    public QuestionState() {
        handler = new ErrorHandlerStateQuestion();
        menu = "Enter Question:";
        setCommandExit(false);
        setCommandZero(false);
    }

    @Override
    public void outputContentState() {
        System.out.println(menu);
    }

    @Override
    protected void changeState(Console context, String inData) {
        int index = State.getIndexProject() - 1;
        Project project = projects.get(index);
        project.setFaq(inData);
        context.setCurrentState(new ProjectState());
    }

}
