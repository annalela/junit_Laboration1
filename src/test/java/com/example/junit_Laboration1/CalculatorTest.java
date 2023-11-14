package com.example.junit_Laboration1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

    @Test
    @DisplayName("Summan blir korrekt")
    public void addTwoNumbers_thenReturnZeroIfSumCorrect() {
        Calculator tester = new Calculator();
        assertEquals(9, tester.add(5, 4));
    }

    @Test
    @DisplayName("Subtrahera ett minustal")
    public void subtractTwoNumbers_thenReturnZeroIfSubCorrect() {
        Calculator tester = new Calculator();
        assertEquals(40, tester.subtract(30, -10));
    }

    @Test
    @DisplayName("Dividera och se att kvoten har decimaltal")
    public void divideTwoNumbers_thenReturnZeroIfQuotHasDecimals() {
        Calculator tester = new Calculator();
        assertNotEquals(33, tester.divide(100, 3 ));
    }

    @Test
    @DisplayName("Beräkning av cirkelns area korrekt avrundad")
    public void getCircleArea_thenReturnZeroIfAreaRoundedCorrect() {
        Calculator tester = new Calculator();
        assertEquals(314.16, tester.getArea(10));
    }

    @Test
    @DisplayName("Beräkning av cirkelns area är fel avrundad")
    public void getCircleArea_thenReturnZeroIfAreaRoundedInCorrect() {
        Calculator tester = new Calculator();
        assertNotEquals(314.159, tester.getArea(10));
    }
}