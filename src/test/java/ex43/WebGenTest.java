/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex43;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WebGenTest{
    @Test
    void createWebsiteTest(){
        WebGen test = new WebGen();
        test.path = "src/main/java/ex43/";
        test.siteName = "website.com";
        test.author = "Robert Salazar";
        String expected = "src/main/java/ex43/website.com";
        String actual = test.createWebsite();
        assertEquals(expected, actual);
    }

    @Test
    void createJSFolderTest(){
       WebGen test = new WebGen();
       test.path = "src/main/java/ex43/";
       test.siteName = "website.com";
       test.author = "Robert Salazar";
       String expected = "src/main/java/ex43/website.com/js";
       String actual = test.createJSFolder();
       assertEquals(expected, actual);
    }

    @Test
    void createCSSFolderTest(){
        WebGen test = new WebGen();
        test.path = "src/main/java/ex43/";
        test.siteName = "website.com";
        test.author = "Robert Salazar";
        String expected = "src/main/java/ex43/website.com/css";
        String actual = test.createCSSFolder();
        assertEquals(expected, actual);
    }

    @Test
    void createHTMlTest(){
       WebGen test = new WebGen();
       test.path = "src/main/java/ex43/";
       test.siteName = "website.com";
       test.author = "Robert Salazar";
       String expected = "src/main/java/ex43/website.com/index.html";
       String actual = test.createHTMl();
       assertEquals(expected, actual);
    }
}