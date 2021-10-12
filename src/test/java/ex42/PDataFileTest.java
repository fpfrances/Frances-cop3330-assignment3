/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex42;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PDataFileTest{
    @Test
    void StringReformatTest1(){
        String[] expected = new String[2];
        String[] actual = new String[2];
        expected[0] = "Ling      Mai       55900";
        expected[1] = "Johnson   Jim       56500";
        actual[0] = "Ling,Mai,55900";
        actual[1] = "Johnson,Jim,56500";
        StringReformat.outputFormat(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void StringReformatTest2(){
        String[] expected = new String[2];
        String[] actual = new String[2];
        expected[0] = "Amen      Bruh      42069";
        expected[1] = "Yessir    lol       69420";
        actual[0] = "Amen,Bruh,42069";
        actual[1] = "Yessir,lol,69420";
        StringReformat.outputFormat(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void stringGenTest(){
        String expected =
                """
                        Last      First     Salary
                        --------------------------
                        Amen      Bruh      42069
                        Yessir    lol       69420
                                                    """;

        String[] actual_array = new String[2];
        actual_array[0] = "Amen      Bruh      42069";
        actual_array[1] = "Yessir    lol       69420";
        String actual = StringGenerator.tableString(actual_array);
        assertEquals(expected, actual);
    }
}