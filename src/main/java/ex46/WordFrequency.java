/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex46;
import java.util.ArrayList;

public class WordFrequency{
    public static String contentString(String input){
        ArrayList<String> sorted = CreateList.sort(input);
        String[] wordEach = new String[sorted.size()];
        int uniqueWords = UniqueWords.count(sorted, wordEach);
        int counter = 0;
        int[] frequencyAmount = new int[uniqueWords + 1];
        String[] output = new String[uniqueWords + 1];
        for (int i = 0; i < uniqueWords + 1; i++){
            StringBuilder wordOFi;
            String currentWord = wordEach[i];
            int totalInstances = 0;
            while (true){
                if (counter != sorted.size() && currentWord.contentEquals(sorted.get(counter++))){
                    totalInstances++;
                } else{
                    wordOFi = wordFormat(currentWord, totalInstances);
                    break;
                }
            }
            output[i] = wordOFi.toString();
            frequencyAmount[i] = totalInstances;
            counter--;
        }
        FinalSort.stringArray(output, frequencyAmount);
        return outputString(uniqueWords,output);
    }
    public static String outputString(int uniqueWords, String[] output){
        StringBuilder retString = new StringBuilder();
        for (int i = 0; i < uniqueWords + 1; i++){
            retString.append(output[i]).append("\n");
        }
        return retString.toString();
    }
    public static StringBuilder wordFormat(String currentWord, int totalInstances){
        StringBuilder word = new StringBuilder();
        StringBuilder space = space(currentWord);
        word.append(currentWord).append(": ").append(space);
        word.append("*".repeat(Math.max(0, totalInstances)));
        return word;
    }
    public static StringBuilder space(String currentWord){
        StringBuilder space = new StringBuilder();
        int amount = currentWord.length();
        while (amount != 8){
            space.append(" ");
            amount++;
        }
        return space;
    }
}
