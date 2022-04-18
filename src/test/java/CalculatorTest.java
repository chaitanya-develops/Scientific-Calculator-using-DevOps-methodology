import static org.junit.Assert.*;
import Calculator.Calculator;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-5;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root of a number for True Positive", 5.0, calculator.squareRoot(25), DELTA);
        assertEquals("Finding square root of a number for True Positive", 11.0, calculator.squareRoot(121), DELTA);
        assertEquals("Finding square root of a number for True Positive", Double.NaN, calculator.squareRoot(-21), DELTA);
        assertEquals("Finding square root of a number for True Positive", 0.0, calculator.squareRoot(-0), DELTA);
    }

    @Test
    public void squareRootTrueNegative(){
        assertNotEquals("Finding square root of a number for False Negative", 5.0, calculator.squareRoot(125), DELTA);
        assertNotEquals("Finding square root of a number for False Negative", 11.0, calculator.squareRoot(12321), DELTA);
        assertNotEquals("Finding square root of a number for False Negative", Double.NaN, calculator.squareRoot(-0), DELTA);
        assertNotEquals("Finding square root of a number for False Negative", 2.0, calculator.squareRoot(-4), DELTA);

    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 1.0, calculator.factorial(0), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 120.0, calculator.factorial(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", -1, calculator.factorial(-1), DELTA);
    }

    @Test
    public void factorialTrueNegative(){
        assertNotEquals("Finding factorial of a number for False Negative", 5.0, calculator.factorial(2), DELTA);
        assertNotEquals("Finding factorial of a number for False Negative", 0.0, calculator.factorial(1), DELTA);
        assertNotEquals("Finding factorial of a number for False Negative", 0.0, calculator.factorial(-20), DELTA);
    }

    @Test
    public void logarithmTruePositive(){
        assertEquals("Finding logarithm of a number for True Positive", 3.5263605246, calculator.naturalLog(34), DELTA);
        assertEquals("Finding logarithm of a number for True Positive", 0.0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding logarithm of a number for True Positive", Double.NaN, calculator.naturalLog(-1), DELTA);
    }

    @Test
    public void logarithmTrueNegative(){
        assertNotEquals("Finding logarithm of a number for False Negative", 5.0, calculator.naturalLog(2), DELTA);
        assertNotEquals("Finding logarithm of a number for False Negative", 10.0, calculator.naturalLog(1), DELTA);
        assertNotEquals("Finding logarithm of a number for False Negative", Double.NaN, calculator.naturalLog(-0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power of a base number for True Positive", 8.0, calculator.powerFunction(2,3), DELTA);
        assertEquals("Finding power of a base number for True Positive", 1.0, calculator.powerFunction(1,8), DELTA);
        assertEquals("Finding power of a base number for True Positive", 1.0, calculator.powerFunction(0,0), DELTA);
    }

    @Test
    public void powerTrueNegative(){
        assertNotEquals("Finding power of a base number for False Negative", 5.0, calculator.naturalLog(2), DELTA);
        assertNotEquals("Finding power of a base number for False Negative", 10.0, calculator.naturalLog(1), DELTA);

    }

}
