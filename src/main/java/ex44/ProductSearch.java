/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
/*
 *
 *   PSEUDO CODE:
 *
 *   MAIN()
 *       gather input
 *
 *       call function inputcheck()
 *           if return true  break loop
 *           else continue
 *
 *   InputVerify()
 *       parse json file
 *
 *       look for header and run ...
 *
 *       for(there is items)
 *           get name, if name == input
 *               print name, price, quantity
 *           return true
 *       end of for
 *
 *       return false
 *
 */
package ex44;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.util.Scanner;

public class ProductSearch{
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ParseException{
        while (true){
            System.out.print("What is the product name? ");
            String input = scanner.nextLine();
            boolean flag = InputVerify.check(input);
            if (!flag){
                System.out.println("Sorry, that product was not found in our inventory.");
                continue;
            }
            break;
        }
    }
}
