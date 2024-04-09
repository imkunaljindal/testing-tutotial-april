package com.example.testingTutorialApril;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

public class CalculatorTests {

    Calculator calculator = new Calculator();

    @BeforeAll
    public static void setup() {
        System.out.println("This runs before all the tests of this class");
    }

    @BeforeEach
    public void befpreEveryTest() {
        System.out.println("This runs before every test");
    }

    @Test
    public void testAddSWhenNumbersArePositive() {
        System.out.println("test add function");
        int result = calculator.add(5,6);
        int expected = 11;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testAddSWhenNumbersAreNegative() {
        int result = calculator.add(-5,-6);
        int expected = -11;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10,5);
        int expected = 5;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testMultiply() {
        System.out.println("test multiply");
        int result = calculator.multiply(10,5);
        int expected = 50;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void testAddManyNumbers() {
        int result = calculator.addManyNumbers(1,2,3,4);
        int expected = 10;
        Assertions.assertEquals(result,expected);
    }

    @AfterAll
    public static void cleanup() {
        System.out.println("This runs after all the test");
    }

}
