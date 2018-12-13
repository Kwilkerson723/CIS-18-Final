package com.company;

import java.io.File;

public class FileFinder {
    FileFinder(){}

    void fileFinder(String fName, File file){           //works
        File[] list = file.listFiles();
        if(list!=null)
            for(File file1 :list){
                if(file1.isDirectory()){fileFinder(fName,file1);}

                else if(fName.equalsIgnoreCase(file1.getName())){
                    System.out.println("Location -> "+file1.getParentFile());

                }

            }

    }
}
