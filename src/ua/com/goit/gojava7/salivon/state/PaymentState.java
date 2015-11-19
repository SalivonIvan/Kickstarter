package ua.com.goit.gojava7.salivon.state;

import java.util.List;
import ua.com.goit.gojava7.salivon.beans.Project;
import ua.com.goit.gojava7.salivon.stores.StoreProjects;
import ua.com.goit.gojava7.salivon.context.Console;

public abstract class PaymentState extends State {

    protected Project project = getManagerData().getProject(State.getIndexProject());

    public PaymentState() {
        setCommandExit(false);
        setCommandZero(false);

    }

}
