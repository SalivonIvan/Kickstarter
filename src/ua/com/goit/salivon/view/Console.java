/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.goit.salivon.view;

import ua.com.goit.salivon.controllers.ControllerScene;
import java.util.Scanner;
import ua.com.goit.salivon.scenes.ViewScene;

/**
 *
 * @author Salivon Ivan
 */
public class Console {

    private ViewScene scene;
    private String inData;
    private Scanner scan;

    public Console() {
        scan = new Scanner(System.in);
    }

    public String getInData() {
        return inData;
    }

    private void setScene(ViewScene scene) {
        this.scene = scene;
    }

    private void print() {
        System.out.println(scene.showScene().toString());
    }

    private void reader() {
        inData = scan.next();
    }

    private void closeStream() {
        scan.close();
    }

    public void execute(ViewScene scene) {
        setScene(scene);
        print();
        reader();
        if (inData.equalsIgnoreCase("q")) {
            System.out.println("Goodbye my LORD!");
            closeStream();
            Runtime.getRuntime().exit(0);
            return;
        }

    }

}
