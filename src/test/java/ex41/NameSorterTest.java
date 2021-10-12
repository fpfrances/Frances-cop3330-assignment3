/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex41;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest{
    @Test
    void StringGenTest(){
        String expected =
                "Total of 2 names\n" +
                        "-----------------\n" +
                        """
                                Johnson, Jim
                                Jones, Aaron
                                                """;

        ArrayList<String> actual_arraylist = new ArrayList<>();
        actual_arraylist.add("Johnson, Jim");
        actual_arraylist.add("Jones, Aaron");
        String actual = PrintFile.Generator(actual_arraylist);
        assertEquals(actual, expected);
    }

    @Test
    void sortInputTest1(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Johnson, Jim");
        expected.add("Jones, Aaron");
        ArrayList<String> actual = new ArrayList<>();
        actual.add("Jones, Aaron");
        actual.add("Johnson, Jim");
        ReadFile.SortInput(actual);
        assertEquals(actual, expected);
    }

    @Test
    void sortInputTest2(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Jones, Aaron");
        expected.add("Johnson, Jim");
        ArrayList<String> actual = new ArrayList<>();
        actual.add("Jones, Aaron");
        actual.add("Johnson, Jim");
        ReadFile.SortInput(actual);
        assertNotEquals(actual, expected);
    }
}

