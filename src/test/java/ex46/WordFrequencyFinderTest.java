/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex46;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest{
    @Test
    void UniqueWordsTest(){
        ArrayList<String> sorted = new ArrayList<>();
        sorted.add("badger");
        sorted.add("badger");
        sorted.add("badger");
        sorted.add("swan");
        sorted.add("duck");
        sorted.add("duck");
        sorted.add("duck");
        sorted.add("turtle");
        String[] wordEach = new String[sorted.size()];
        int actual = UniqueWords.count(sorted, wordEach);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void SortedListTest(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("badger");
        expected.add("badger");
        expected.add("badger");
        expected.add("duck");
        expected.add("duck");
        expected.add("duck");
        expected.add("swan");
        expected.add("turtle");
        String test = "badger badger badger\nswan duck\nduck duck turtle\n";
        ArrayList<String> actual = CreateList.sort(test);
        assertEquals(expected,actual);
    }

    @Test
    void FinalStringTest(){
        String expected =
                """
                        duck:     ****
                        badger:   ***
                        swan:     *
                        turtle:   *
                                        """;
        String test = "badger badger badger\nswan duck\nduck duck turtle\nduck\n";
        String actual = WordFrequency.contentString(test);
        assertEquals(expected, actual);
    }
}