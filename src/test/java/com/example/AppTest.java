package com.javapoint;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static Calculator calculator;

    @BeforeAll
    static void setUp(){
        calculator = new Calculator();
    }

    @Test
    void addSimple(){
        double result = calculator.calculate(1,1,'+');
        assertEquals(2,result);
    }

    @Test
    void multiplySimple(){
        double result = calculator.calculate(1,1,'*');
        assertEquals(1,result);
    }

    @Test
    void subtractSimple(){
        double result = calculator.calculate(1,1,'-');
        assertEquals(0,result);
    }

    @Test
    void divideSimple(){
        double result = calculator.calculate(1,1,'/');
        assertEquals(1,result);
    }

    // //.....
    // @Test
    // void illegalArgument() {
    //     Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.calculate(1, 1, '/'));
    // }

    // @Test
    // void divideByZero() {
    //     Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.calculate(1, 0, ':'));
    // }
}
