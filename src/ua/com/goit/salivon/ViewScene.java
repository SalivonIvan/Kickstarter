/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon;

/**
 *
 * @author Salivon Ivan
 */
public abstract class ViewScene {

    protected StringBuilder textScene;
    protected String errorMessages;
    protected String menu;
    protected String inData;
    protected HendlingError hendling;

    public  StringBuilder showScene(){
        return textScene;
    }

    public abstract  void createScene();
}
