package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Disabled
    void testCalculatorNull() {
        Calculator calculator = null;
        assertNull(calculator);
    }

    @Test
    @DisplayName("Testing add function in calculator")
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(4, 4));
    }

    @RepeatedTest(5)
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(8, 4));
    }


    @Test
    @AfterEach
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertNotEquals(50, calculator.multiplication(7, 7));
        System.out.println("AfterEach annotation for multiplication testmethod");
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.division(8, 4) == 2);
    }
}