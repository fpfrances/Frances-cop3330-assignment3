/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex41;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadFile{
    public static ArrayList<String> readNames(ArrayList<String> names) throws FileNotFoundException{
        File document = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner input = new Scanner(document);
        ArrayList<String> output = names;
        while(input.hasNextLine())
        {
            output.add(input.nextLine());
        }
        Collections.sort(output);
        return output;
    }
    public static ArrayList<String> SortInput(ArrayList<String> input){
        Collections.sort(input);
        return input;
    }
}
