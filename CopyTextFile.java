package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyTextFile {
CopyTextFile(){}

void CopyTxtFile(String string,String oString){
        FileInputStream istream;
        FileOutputStream ostream;

        try{
            File ifile =new File("C:\\Users\\M4 Sherman\\Desktop\\"+string);
            File ofile =new File("C:\\Users\\M4 Sherman\\Desktop\\"+oString);

            istream = new FileInputStream(ifile);
            ostream = new FileOutputStream(ofile);

            byte[] buffer = new byte[1024];

            int length;
            //copying
            while ((length = istream.read(buffer)) > 0){
                ostream.write(buffer, 0, length);
            }

            //close the input ,output
            try {
                istream.close();
                ostream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.println("It worked!");

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
