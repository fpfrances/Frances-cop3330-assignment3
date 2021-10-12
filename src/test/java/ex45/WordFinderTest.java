/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex45;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest{
    @Test
    void WordReplacerTest1(){
        String expected = "I like coding in C";
        String actual = "I like coding in java";
        String original = "java";
        String replacer = "C";
        actual = WordReplacer.string(actual, original, replacer);
        assertEquals(expected,actual);
    }

    @Test
    void WordReplacerTest2(){
        String expected = "Where is my super suit?";
        String actual = "Where is my pants?";
        String original = "pants";
        String replacer = "super suit";
        actual = WordReplacer.string(actual, original, replacer);
        assertEquals(expected,actual);
    }

    @Test
    void FileChecker() throws IOException{
        String userDirec = System.getProperty("user.dir");
        String example = "It is working properly!";
        FileExport.fileGenerator(example, "filecheck");
        File checker = new File(userDirec + "\\src/main/java/Output Files\\filecheck.txt");
        boolean actual = checker.exists();
        assertTrue(actual);
    }
}