package intToString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ConvertIntToStringTest {

    @Test
    public void myFirstTest(){

        ConvertIntToString convert = new ConvertIntToString();
        String source = "123";
        int expected = 123;
        int actual = Integer.parseInt(convert.stringToInt(source));
        Assertions.assertEquals(expected,actual);

    }
}
