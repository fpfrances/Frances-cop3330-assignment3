/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex45;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{
    public static String read() throws FileNotFoundException{
        StringBuilder output = new StringBuilder();
        File document = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner scanner = new Scanner(document);
        while (scanner.hasNextLine()){
            output.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return output.toString();
    }
}
