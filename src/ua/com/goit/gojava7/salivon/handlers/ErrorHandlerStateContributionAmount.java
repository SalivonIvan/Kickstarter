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
public class ErrorHandlerStateContributionAmount implements ErrorHandler {

    @Override
    public boolean validate(String inData) {
      int amount = 0;
        try {
            amount = Integer.parseInt(inData);
        } catch (NumberFormatException e) {
           
            return false;
        }
        return true;
    }
    
}
