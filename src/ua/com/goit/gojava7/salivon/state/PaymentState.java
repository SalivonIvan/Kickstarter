/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.state;

import java.util.List;
import ua.com.goit.gojava7.salivon.beans.Project;
import ua.com.goit.gojava7.salivon.handlers.ErrorHandlerStatePayment;
import ua.com.goit.gojava7.salivon.stores.StoreProjects;
import ua.com.goit.gojava7.salivon.context.Console;

/**
 *
 * @author Salivon Ivan
 */
public abstract class PaymentState extends State {

    protected List<Project> projects = StoreProjects.getProjects();

    public PaymentState() {
        setCommandExit(false);
        setCommandZero(false);
        menu = "Enter 0 - return to above.\n"
                + "Enter 'q' - to exit.\n";

    }

}
