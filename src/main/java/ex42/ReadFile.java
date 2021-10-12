/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex42;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{
        static final int MAX = 7;
        static String[] storeData () throws FileNotFoundException{
            String[] input = new String[MAX];
            File document = new File("src/main/java/ex42/exercise42_input.txt");
            Scanner scanner = new Scanner(document);
            int count = 0;
            while (scanner.hasNextLine()){
                input[count++] = scanner.nextLine();
            }
            scanner.close();
            return input;
        }
}
