/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gcorcoran
 */
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
        System.out.println("What record do you want to see?");
        int record = keyboard.nextInt();
        int begin = record*8 - 8;
        int end = record*8;
        // 0 - 7 for one
        int counter=0;
        
        try{
        for(String str:myList){
            
            if(counter>=begin&&counter<end)
            System.out.println(str);
            counter++;
        }
        } catch (IllegalArgumentException iae){
            System.out.println("Sorry, there are only " + myList.size()/7 + " entries");
        }
    }
       
}
