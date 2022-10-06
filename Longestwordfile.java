/*
 * 2.	Write a Java program to find the longest word in a text file.
 */
package com.file.bll;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Longestwordfile {
     public static void main(String [ ] args) throws FileNotFoundException {
              new Longestwordfile().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("F:\\java codes\\javaTeset01\\src\\com\\file\\bll\\file2.txt"));


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {
             longest_word = current;
           }

       }
         System.out.println("\n longest word :"+longest_word+"\n");
            return longest_word;
            }
}