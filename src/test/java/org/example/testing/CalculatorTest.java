package org.example.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;
    @BeforeAll
    static void setUp() {
        Calculator calculator = new Calculator();
    }

    @Test
    void testDivision() {
        int res =  calculator.division(4,2);
//        assertions are what we use to verify, if the method under test that we are testing works well
//        returns correct result.
//        Each assertion method is a small utility method that makes a decision whether this unit test should
//        pass or fail. and it makes decision by evaluating condition with a given input parameters
        assertEquals(2,res,"4/2 did not produce 2");

        // fail()- it fails the unit test purposefully without checking for any conditions
//        fail("This test method will definitely fail");

    }

//    @Test
//    void testIntegerSubtraction(){
//        int minuend = 35;
//        int subtrahend = 10;
//        int expectedResult = 25;
//
//        int actualRes = calculator.integerSubtraction(minuend,subtrahend);
//        // since this will be everytime we called, it can slow down the application
//        // to fix this we are going to use lambda function.
//        assertEquals(expectedResult, actualRes,
//                ()->minuend + "-" + subtrahend + "did not produce "+expectedResult);
//        // if the test is passing, this lambda function will never get executed and
//        // no resources will be spent to compute this error message.
//    }

    //Parameterised Tests
    @ParameterizedTest
    @MethodSource("integerSubtractionInputParameters")
    void testIntegerSubtraction(int a, int b, int expected) {

    }
}