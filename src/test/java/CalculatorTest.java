import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.*;
import Calculator.Calculator;

public class CalculatorTest {

    @BeforeAll
    static void message() {
        System.out.println("Performing Calculator tests...\n");
    }

    @AfterEach
    void afterEachTest() {
        System.out.println("=====================\n");
    }

    @Test
    @DisplayName("Addition")
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiplication")
    void testMul() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.mul(2, 2));
    }

    @Test
    @DisplayName("Subtraction")
    void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    @DisplayName("Division")
    void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.div(2, 2));
    }

    @DisplayName("True checker")
    @RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void testTrue() {
        int a = 10;
        int b = 20;
        assertTrue(a < b);
        System.out.println("Checker for true.");
    }

    @AfterAll
    static void messageAfter() {
        System.out.println("Calculator tests completed.");
    }


}
