/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Filipe Frances
 */
package ex44;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class ProductSearchTest{
    @Test
    void InputCheckerTest1() throws IOException, ParseException{
        boolean actual = InputVerify.check("iPad");
        assertFalse(actual);
    }

    @Test
    void InputCheckerTest2() throws IOException, ParseException{
        boolean actual = InputVerify.check("Galaxy Thing");
        assertFalse(actual);
    }

    @Test
    void InputCheckerTest3() throws IOException, ParseException{
        boolean actual = InputVerify.check("Thing");
        assertTrue(actual);
    }

    @Test
    void InputCheckerTest4() throws IOException, ParseException{
        boolean actual = InputVerify.check("Widget");
        assertTrue(actual);
    }

    @Test
    void InputCheckerTest5() throws IOException, ParseException{
        boolean actual = InputVerify.check("Doodad");
        assertTrue(actual);
    }
}