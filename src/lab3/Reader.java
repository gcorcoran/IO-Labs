package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws IOException {
        
       
        File data = new File("src" + File.separatorChar + "practice.txt");
        List<String> myList = new ArrayList<String>();
        
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            
            while (line != null) {
                myList.add(line);
                line = in.readLine();
            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println("Could not close stream");
            }
        }
        // start of writer
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What records city do you want to see?");
        int record = keyboard.nextInt();
        int city = record*8 -5;
        
        System.out.println(myList.get(city));
        
    }
       
}
