/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
/*
 *   PSEUDO CODE:
 *
 *   main()
 *       read file()
 *       take two words and call word replacer ()
 *       print (new document)
 *       scan (new document name)
 *       export file (new document name)
 *       print path + name of new file
 *
 *   word replacer()
 *       return a string w/o old word
 *
 *   file export()
 *   1.  take new document name
 *       call file gen ()
 *       return name of new document
 *   2.  append desired location and file name to the user directory
 *       take new user directory and use for FileWrite() path
 *       write string to document
 *       close writer
 *
 */
package ex45;
import java.io.IOException;

public class WordFinder{
    public static final String userDirec = System.getProperty("user.dir");
       public static void main(String[] args) throws IOException{
            String input = ReadFile.read();
            System.out.println("Old document:\n\n" + input + "\n");
            String old = "utilize";
            String replacer = "use";
            System.out.println("New document:\n");
            String output = WordReplacer.string(input, old, replacer);
            System.out.println(output);
            System.out.println("-----------------------------------------------------------------\n");
            String fileName = FileExport.fileName(output);
            System.out.println("New file generated in:\n" + userDirec + "\\src/main/java/Output Files\\" + fileName + ".txt");
       }
}
