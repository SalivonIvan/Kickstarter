/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.handlers;

import ua.com.goit.gojava7.salivon.state.State;

/**
 *
 * @author Salivon Ivan
 */
public class ErrorHandlerStatePayment extends ErrorHandler {

    @Override
    public boolean validate(String inDate) {
        try {
            int n = Integer.parseInt(inDate);

            return n == 0;

        } catch (NumberFormatException e) {
            if (inDate.equalsIgnoreCase("q")) {
                exit();
            }
            return false;
        }
    }

    public int validateAmount(String inData) {
        int amount = 0;
        try {
            amount = Integer.parseInt(inData);
        } catch (Exception e) {
            System.out.println("Enter the correct data!");
            validateAmount(State.getScan().next());
        }
        return amount;
    }

}
