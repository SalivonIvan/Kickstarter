/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.state;

import java.util.List;
import ua.com.goit.gojava7.salivon.beans.Project;
import ua.com.goit.gojava7.salivon.handlers.HandlerErrorPaymentState;
import ua.com.goit.gojava7.salivon.stores.StoreProjects;
import ua.com.goit.gojava7.salivon.view.Console;

/**
 *
 * @author Salivon Ivan
 */
public class PaymentState extends State {

    private List<Project> projects = StoreProjects.getProjects();
    HandlerErrorPaymentState handlerAmount;

    public PaymentState() {
        handler = new HandlerErrorPaymentState();
        handlerAmount = (HandlerErrorPaymentState) handler;
        menu = "Enter 0 - return to above.\n"
                + "Enter 'q' - to exit.\n";

    }

    @Override
    public void outputContentState() {
        int index = State.getIndexProject() - 1;
        Project project = projects.get(index);
        System.out.println("Enter your name:");
        String nameInvestor = State.scan.next();
        System.out.println("Enter credit card number:");
        String numberCreditCard = State.scan.next();
        System.out.println("Enter the contribution amount:");
        changeCollectedAmount(project, handlerAmount.validateAmount(State.getScan().next()));
        System.out.println(menu);
    }

    @Override
    protected void changeState(Console context, String inData) {
        context.setCurrentState(context.getProjectState());
    }

    protected void changeCollectedAmount(Project project, int amount) {
        project.setCollectedAmount(amount);
    }

}
