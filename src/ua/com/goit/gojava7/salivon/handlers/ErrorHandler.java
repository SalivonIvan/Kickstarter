/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.gojava7.salivon.handlers;

import ua.com.goit.gojava7.salivon.state.State;

/**
 *
 * @author salivon.i
 */
public interface ErrorHandler {

    public abstract boolean validate(String inDate);

}
