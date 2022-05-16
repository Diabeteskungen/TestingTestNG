import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {
    @Test
    public void addingvalues() {
        Calculator calculator = new Calculator();

        int result = calculator.add(20, 30);

        assertEquals(result, 50);
    }
}