/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex43;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebGen{
    String siteName;
    String author;
    String path;
    public String createWebsite(){
        String directory = path + siteName;
        File newFolder = new File(directory);
        newFolder.mkdirs();
        return directory;
    }
    public String createJSFolder(){
        String directory = path + siteName + "/js";
        File newFolder = new File(directory);
        newFolder.mkdirs();
        return directory;
    }
    public String createCSSFolder(){
        String directory = path + siteName + "/css";
        File newFolder = new File(directory);
        newFolder.mkdirs();
        return directory;
    }
    public String createHTMl(){
        String directory = path + siteName + "/index.html";
        String htmlContent = "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";
        File file = new File(directory);
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;
        } catch(Exception ex){
            return "Failure";
        }
    }
}

