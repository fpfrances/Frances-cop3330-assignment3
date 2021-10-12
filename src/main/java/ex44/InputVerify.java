/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex44;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class InputVerify{
    public static final JSONParser parser = new JSONParser();
    public static boolean check(String input) throws IOException, ParseException{
        JSONObject obj = (JSONObject) parser.parse(new FileReader("src/main/java/ex44/exercise44_input.json"));
        JSONArray items = (JSONArray) obj.get("products");
        for (Object subject : items){
            JSONObject json = (JSONObject) subject;
            String name = (String) json.get("name");
            if (input.equalsIgnoreCase(name)){
                Formatter USD = new Formatter();
                double temp = (double) json.get("price");
                USD.format("%.2f", temp);
                System.out.println("Name: " + name);
                System.out.println("Price: " + USD);
                System.out.println("Quantity: " + json.get("quantity"));
                return true;
            }
        }
      return false;
    }
}
