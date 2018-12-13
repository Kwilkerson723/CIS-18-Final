package com.company;

import java.io.File;

public class DeleteFile {
    DeleteFile(){}

    void delete(String string){
        File file = new File(string);
    file.delete(); //that was easy?
System.out.println(string + " deleted");
    }


}
