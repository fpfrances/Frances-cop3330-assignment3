/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
/*
 *
 *   PSEUDO CODE:
 *
 *   while(there is a line to scan)
 *       scan next line
 *       compound scanned line into a string array
 *       send string array to main
 *
 *   reformat string array into table format
 *       while there isn't a ',' append characters
 *           add spaces when there is a ','
 *
 *       while there isn't a ',' append characters
 *           add spaces when there is a ','
 *
 *       for a count is not salary cap
 *           append salary value to so string
 *
 *       place string into the string array
 *
 *       repeat until list is done
 *
 *
 *   send string array off to be converted to string
 *       include output header and newlines where necessary
 *
 *   print the final string in main
 *
 */
package ex42;
import java.io.FileNotFoundException;

public class PDataFile{
    public static void main(String[] args) throws FileNotFoundException{
        String[] input = ReadFile.storeData();
        StringReformat.outputFormat(input);
        String output = StringGenerator.tableString(input);
        System.out.println(output);
    }
}
