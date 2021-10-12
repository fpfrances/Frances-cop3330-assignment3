/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex45;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileExport{
    public static final Scanner scanner = new Scanner(System.in);
    public static final String userDirec = System.getProperty("user.dir");
        public static String fileName(String fileString) throws IOException{
            System.out.print("Name of the new file: ");
            String output = scanner.nextLine();
            System.out.println();
            fileGenerator(fileString, output);
            return output;
    }
    public static void fileGenerator(String fileString, String name) throws IOException{
        String output = userDirec + "\\src/main/java/Output Files\\" + name + ".txt";
        FileWriter export = new FileWriter(output);
        PrintWriter writer = new PrintWriter(export);
        writer.println(fileString);
        writer.close();
    }
}
