package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    
    
    private Calculator calculator;
    private CalculatorService service;
    
    @BeforeEach
    public void setup() {
        
        calculator = new Calculator();
        service = new CalculatorService(calculator);

   }

    @Test
    public void testAddAndReport() {
       assertEquals("Result: 5", service.addAndReport(2,3));
    }

    @Test
    void testSubtractAndReport() {
       assertEquals("Result: 1", service.subtractAndReport(3,2));
    }

}
