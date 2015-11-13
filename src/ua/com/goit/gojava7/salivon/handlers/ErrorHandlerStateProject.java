/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.handlers;

import ua.com.goit.gojava7.salivon.handlers.ErrorHandler;

/**
 *
 * @author salivon.i
 */
public class ErrorHandlerStateProject implements ErrorHandler {

    @Override
    public boolean validate(String inData) {

        try {
            int n = Integer.parseInt(inData);

            return n == 0 || n == 1 || n == 2;

        } catch (NumberFormatException e) {
            return false;
        }

    }

}
