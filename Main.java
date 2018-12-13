package com.company;


import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to final project");
        Scanner scan = new Scanner(System.in);


        int choice = 0;
        while (choice != 6) {
            if(choice>6){System.out.println("Try again"); }
            System.out.println("1.Open a file on the desktop");
            System.out.println("2.Find the location of a file");
            System.out.println("3.Copy the contents of a txt file to a new txt file");
            System.out.println("4.Delete a file");

            System.out.println("6.Exit");
            choice = scan.nextInt();
            if (choice == 1) {
                OpenFile f = new OpenFile();
                f.openFile();
            } else if (choice == 2) {
                FileFinder ff = new FileFinder();

                Scanner scanner = new Scanner(System.in);
                System.out.println("enter the name of the file you are looking for: ");
                String input = scanner.nextLine();
                System.out.println("Enter the directory to be searched");
                String dir = scanner.nextLine();
                ff.fileFinder(input, new File(dir));
            } else if (choice == 3) {
                CopyTextFile ctf = new CopyTextFile();

                System.out.println("enter the path for the file you wish to copy");
                String fileName = scan.next();

                System.out.println("enter the path of the file for the output");
                String oFileName = scan.next();
                ctf.CopyTxtFile(fileName, oFileName);
            } else if (choice == 4) {
                System.out.println("enter the path and name of the file to be deleted");
                DeleteFile df = new DeleteFile();
                String dFile = scan.nextLine();
                dFile = scan.nextLine();
                df.delete(dFile);

            } else if (choice == 5) {

            }

        }
    }
}
