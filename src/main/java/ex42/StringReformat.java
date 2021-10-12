/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex42;

public class StringReformat{
    static String[] outputFormat(String[] raw){
        for (int i = 0; i < raw.length; i++){
            StringBuilder newString = new StringBuilder();
            int j = 0;
            while (true){
                char ch = raw[i].charAt(j++);
                if (ch == ',') {
                    while (newString.length() != 10){
                        newString.append(" ");
                    }
                    break;
                }
                newString.append(ch);
            }
            while (true){
                char ch = raw[i].charAt(j++);
                if (ch == ',') {
                    while (newString.length() != 20){
                        newString.append(" ");
                    }
                    break;
                }
                newString.append(ch);
            }
            for (int k = 0; k < 5; k++){
                char ch = raw[i].charAt(j++);
                newString.append(ch);
            }
            raw[i] = newString.toString();
        }
        return raw;
    }
}
