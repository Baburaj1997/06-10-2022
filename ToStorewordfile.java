/*
 * 1.	Write a Java program to store text file content line by line into an array.
*/
package com.file.bll;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ToStorewordfile {
	public static void main(String a[]){
    
        String str;
        List<String> list = new ArrayList<String>();
        try {
             BufferedReader br = new BufferedReader(new FileReader("F:\\java codes\\javaTeset01\\src\\com\\file\\bll\\file1.txt"));
    //READ from existing file file1.txt.
             while((str =br.readLine()) != null ){
    //readline() method with read line wise txt.
 	            list.add(str);
 	        }
             
             String[] stringArr = list.toArray(new String[0]);
    //text is count from line 1
 	        System.out.println(" "+Arrays.toString(stringArr));  
 	        br.close();
 	    
 		
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }

}
