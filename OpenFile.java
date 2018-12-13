package com.company;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class OpenFile {

OpenFile(){}

//open a file
void openFile(){        //works on desktop
    System.out.println("Enter the name of the file you're looking for: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    File file = new File("C:\\Users\\M4 Sherman\\Desktop\\"+input);

    if(file.exists()) {
        System.out.println("the file exists! opening...");
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    else {
        if(!file.exists()) System.out.println("Can not find the file: " + input);
         }
    }
}

