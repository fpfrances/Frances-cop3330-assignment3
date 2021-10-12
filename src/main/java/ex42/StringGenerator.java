/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex42;

public class StringGenerator{
    public static String tableString(String[] data){
        StringBuilder output = new StringBuilder();
        output.append("Last      First     Salary\n--------------------------\n");
        for (int i = 0; i < data.length; i++){
            output.append(data[i]).append("\n");
        }
        return output.toString();
    }
}
