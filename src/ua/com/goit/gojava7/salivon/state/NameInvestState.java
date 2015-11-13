/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.state;

import ua.com.goit.gojava7.salivon.context.Console;
import ua.com.goit.gojava7.salivon.handlers.ErrorHandlerStateNameInvest;
import ua.com.goit.gojava7.salivon.handlers.ErrorHandlerStatePayment;

/**
 *
 * @author Salivon Ivan
 */
public class NameInvestState extends PaymentState {

    public NameInvestState() {
        handler = new ErrorHandlerStateNameInvest();
        menu = "Enter your name:";

    }

    @Override
    public void outputContentState() {
        System.out.println(menu);
    }

    @Override
    protected void changeState(Console context, String inData) {
        context.setCurrentState(new CreditCardState());
    }

}
