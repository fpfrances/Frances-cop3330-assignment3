/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex46;
import java.util.ArrayList;

public class UniqueWords{
    public static int count(ArrayList<String> sorted, String[] wordEach){
        int uniqueWords = 0;
        wordEach[0] = sorted.get(0);
        for (int i = 1; i < sorted.size(); i++) {
            String temp = sorted.get(i);
            if(!temp.contentEquals(wordEach[uniqueWords])){
                wordEach[++uniqueWords] = temp;
            }
        }
      return uniqueWords;
    }
}
