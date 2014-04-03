/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gcorcoran
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        
       
        File data = new File("src" + File.separatorChar + "myFile.txt");
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
        
        boolean append = true;  
	File datar = new File("src" + File.separatorChar + "practice.txt");
	  
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(datar, append)));
	  
	  
          out.println("Alec");
          out.println("Baldwin");
          out.println("2002 Baldwin Ave.");
          out.println("Baldwinania");
          out.println("CA");
          out.println("63436");
          out.println("AlecBaldwin@gmail.com");
	  out.close();  
        
        
        
        
        // 0 - 7 for one
        int counter=0;
        for(String str:myList){
            
            //if(counter>7&&counter<=14)
            System.out.println(str);
            counter++;
        }
    } 
        
    }

