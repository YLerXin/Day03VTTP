package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;// only knows to read bytes

public class IOMain {

    public static void main(String[] args)
     throws FileNotFoundException, IOException{
        File file = new File(args[0]);
        // InputStream is = new FileInputStream(file);
    

    // //create bffer
    // byte[] buffer = new byte[1024];
    // int bytesRead = 0;
    // int total = 0;

    // while((bytesRead >= 0)){
    //     bytesRead = is.read(buffer);

    //     if (bytesRead >=0){
    //         total += bytesRead;
    //     }
    //     System.out.printf(">>> bytes read:%d\n",bytesRead);


    // }


    // is.close();
        InputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);

        while(true){
            String line = dis.readUTF();
            System.out.println

        }





     }
    
}
