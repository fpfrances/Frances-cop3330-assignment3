/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
/*
 *
 *  PSEUDO CODE:
 *
 *  while (line to scan)
 *  scan next line
 *  compound scanned line into an array list
 *
 *  send previously scanned data to ReadFile
 *      adding names to data input
 *
 *  send ReadFile to a printer
 *      print ""
 *              Total of 7 names
 *              -----------------
 *                              ""
 *
 *      then there are names left to print
 *      print name + new line
 *
 */
package ex41;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSorter{
    public static void main(String[] args) throws FileNotFoundException{
            Scanner inputFile = new Scanner("src/main/java/ex41/exercise41_input.txt");
            ArrayList<String> names = new ArrayList<String>();
            inputFile.close();
            try{
                ArrayList<String> docData = ReadFile.readNames(names);
                String output = PrintFile.Generator(docData);
                PrintFile.outputNames(output);
            }
            catch(Exception e){
                System.out.println(e);
            }
      }
}
