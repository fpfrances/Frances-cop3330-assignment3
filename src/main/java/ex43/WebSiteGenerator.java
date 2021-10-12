/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
/*
 *
 *   PSEUDO CODE:
 *
 *   take user input in main()
 *       call WebSiteGenerator(all input)
 *
 *   in WebsiteGenerator
 *       make a user directory string
 *       append new site directory to it
 *       check if the folder is made
 *           if so try to make a css, js and html folder/file
 *
 *   in WebGen
 *       website generator
 *       use directory to create a folder labeled "website"
 *
 *       css generator
 *       use directory to make a folder labeled "css"
 *
 *       js generator
 *       use directory to make a folder labeled "js"
 *
 *       html generator
 *       using the user inputs
 *       tack on all necessary headers and descriptors to html
 *
 */
package ex43;
import java.util.Scanner;

public class WebSiteGenerator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String siteName;
        String author;
        String wantCSS;
        String wantJS;
        System.out.print("Site name: ");
        siteName = sc.nextLine();
        System.out.print("Author: ");
        author = sc.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        wantJS = sc.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        wantCSS = sc.nextLine();
        WebGen newWebsite = new WebGen();
        newWebsite.siteName = siteName;
        newWebsite.author = author;
        newWebsite.path = "./website/";
        System.out.println("Created " +newWebsite.createWebsite());
        System.out.println("Created " +newWebsite.createHTMl());
        if(wantJS.equals("y"))
            System.out.println("Created " +newWebsite.createJSFolder()+ "/");
        if(wantCSS.equals("y"))
            System.out.println("Created " +newWebsite.createCSSFolder()+ "/");
    }
}

