/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex46;

public class FinalSort{
    public static void stringArray(String[] output, int[] amount){
        int n = amount.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if(amount[j] < amount[j+1]){
                    String tempStr = output[j];
                    output[j] = output[j + 1];
                    output[j + 1] = tempStr;
                    int tempNum = amount[j];
                    amount[j] = amount[j + 1];
                    amount[j + 1] = tempNum;
                }
            }
        }

    }
}
