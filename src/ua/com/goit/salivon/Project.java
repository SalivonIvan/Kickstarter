/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author salivon.i
 */
public class Project {
    private int id;
    private int idCategory;
    private String title;
    private String description;
    private int total;
    private int  collectedAmount;
    private int numberOfDaysToImplement;
    private Date dateStart;

    public Project() {
        setDateStart();
    }

    private  void setDateStart() {
        dateStart = new Date();
        
    }
    private int getNumberOfDaysToEnd(){
        long milSecondStart = dateStart.getTime();
        long milSecondEnd = Calendar.getInstance().getTimeInMillis();
        int numberOfDaysInWork = (int)(milSecondEnd-milSecondStart)/(1000*60*60*24);
        return numberOfDaysInWork-numberOfDaysToImplement;
    }
    
}
