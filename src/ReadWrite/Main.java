package ReadWrite;

import java.io.File;
//filereader bufferedreader filewrite bufferedwrite
//read from catinthehat.txt to output.txt
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class Main {


    public static void main(String[] args)
    throws FileNotFoundException, IOException{
        File filetoread = new File(args[0]);
        File filetowrite = new File(args[1]);

        FileReader reading = new FileReader(filetoread);
        BufferedReader in = new BufferedReader(reading);

        FileWriter writ = new FileWriter(filetowrite);
        BufferedWriter out = new BufferedWriter(writ);



        while (true) {
            String line = in.readLine();
             if (null == line)
                break;
            out.write(line);
            out.newLine();



           // System.out.printf(">>> line: %s\n", line.toUpperCase());
        
    

    }
    in.close();
    out.close();
    System.out.println("Written Succeeded");
    

    
    }
}
