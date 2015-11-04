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
 * @author Оля
 */
public class TestApp {

    public static void main(String[] args) {
        Console console = new Console();
        console.createWelcomScene();
        console.print();
        console.createCategoryScene(1);
        console.print();
        console.createProjectScene(4);
        console.print();
//        Date date = new Date();
//        System.out.println(date);
//        for (int i = 0; i < 100000; i++) {
//            System.out.println(i);
//        }
//        Calendar calendar = Calendar.getInstance();
//        long milSecondStart = date.getTime();
//        calendar.set(2015, 11, 25);
//        long milSecondEnd = calendar.getTimeInMillis();
//        System.out.println((milSecondEnd - milSecondStart) / (1000*60*60*24));
    }

}
