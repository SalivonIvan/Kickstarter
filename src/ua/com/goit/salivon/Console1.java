/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon;

import java.util.Scanner;

/**
 *
 * @author Salivon Ivan
 */
public class Console1 {

    private StringBuilder scene;
    private String inData;
    private ControllerScene controller;
    private Scanner scan;

    public Console1() {
        controller = new ControllerScene();
        scan = new Scanner(System.in);
    }

    private void setScene() {
        scene = controller.getAnswer(inData);
    }

    private void print() {
        System.out.println(scene.toString());
    }

    private  void reader() {
        inData = scan.next();
    }

    private  void closeStream() {
        scan.close();
    }
    public void execute(){
        setScene();
        print();
        reader();
        if (inData.equalsIgnoreCase("q")) {
            System.out.println("Goodbye my LORD!");
            closeStream();
            return ;
        }
        execute();
    }

}
