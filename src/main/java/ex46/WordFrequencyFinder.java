/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
/*
 *
 *   PSEUDO CODE:
 *
 *   main()
 *       read file()
 *       get final string()
 *       display (final)
 *
 *   read file()
 *       while(line to scan)
 *           append to string builder
 *       return string builder . toString()
 *
 *   wordFrequency()
 *       create array list from create list sorted()
 *       check for unique words()
 *       add unique words into a string array
 *       for(unique words)
 *           save current word into a temp string
 *           while()
 *               if (temp == sorted array list index)
 *                   total++
 *               else
 *                   compound string w/ *'s and _'s
 *                   break;
 *           save fina string into string[index]
 *           save frequency into an array
 *       sort list(string[], frequency[])
 *
 *       return final string
 *
 *   unique words()
 *       for(sorted array list size)
 *            if new word
 *                 add to index
 *       return amount
 *
 *   final sort()
 *       bubble sort
 *
 *   sorted()
 *       create a string array
 *       add each word into string array
 *       add each string[] to array list
 *       collections.sort array list
 *       return list
 *
 */
package ex46;
import java.io.FileNotFoundException;

public class WordFrequencyFinder{
    public static void main(String[] args) throws FileNotFoundException{
        String input  = ReadFile.read();
        String output = WordFrequency.contentString(input);
        System.out.println(output);
    }
}
