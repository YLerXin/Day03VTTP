package io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMain {
    public static void main(String[] args){
        if (args.length <= 0){
            System.err.println("Please provide a file name");
            System.exit(1);
        }

        for(String a:args){
            System.out.printf("Processing %s\n",a);

            // Path p = Paths.get(a);
            // File file = p.toFile();


            File file = new File(a);
            System.out.printf("Path: %s\n",file.getAbsolutePath());
            System.out.printf("Is file: %s\n",file.isFile());
            System.out.printf("Exsists: %s\n",file.exists());
            System.out.printf("Writes: %s\n",file.canWrite());

        }
    }
    
}
