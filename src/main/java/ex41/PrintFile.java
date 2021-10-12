/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex41;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PrintFile{
    public static void outputNames(String output) throws IOException{
        FileWriter outputNames = new FileWriter("src/main/java/Output Files/exercise41_output.txt");
        outputNames.write(output);
        outputNames.close();
    }
    public static String Generator(ArrayList<String> names){
        StringBuilder output = new StringBuilder();
        output.append("Total of "+ names.size() +" names\n");
        output.append("-----------------\n");
        for(String i: names){
            output.append(i+"\n");
        }
        return output.toString();
    }
}
