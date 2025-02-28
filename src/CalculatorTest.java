import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testSquareRoot() {
        assertEquals(4.0, Calculator.squareRoot(16));
    }

    @Test
    void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test
    void testNaturalLog() {
        assertEquals(Math.log(10), Calculator.naturalLog(10), 0.0001);
    }

    @Test
    void testPower() {
        assertEquals(8, Calculator.power(2, 3));
    }
}

