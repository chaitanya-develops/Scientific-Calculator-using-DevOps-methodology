import static org.junit.Assert.*;
import Calculator.Calculator;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root of a number for True Positive", 5.0, calculator.squareRoot(25), DELTA);
        assertEquals("Finding square root of a number for True Positive", 11.0, calculator.squareRoot(121), DELTA);
    }

    @Test
    public void squareRootTrueNegative(){
        assertNotEquals("Finding square root for False Negative", 5.0, calculator.squareRoot(125), DELTA);
        assertNotEquals("Finding square root for False Negative", 11.0, calculator.squareRoot(12321), DELTA);
    }
}
