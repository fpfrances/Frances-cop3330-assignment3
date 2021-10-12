/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CreateList{
    public static ArrayList<String> sort (String input){
        String[] words = input.replace("\n", " ").split(" ");
        ArrayList<String> sorted = new ArrayList<>(Arrays.asList(words));
        Collections.sort(sorted);
        return sorted;
    }
}
