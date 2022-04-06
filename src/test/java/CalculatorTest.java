import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    @DisplayName("8 * 8 = 64")
    void multipliesTwoNrs() {
        Calculator calculator = new Calculator();
        assertEquals(64, calculator.multi(8, 8), "8 * 8 should equal 64");
    }

    @Test
    @DisplayName("8 / 8 = 1")
    void dividesTwoNrs() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.div(8, 8), "8 / 8 should equal 1");
    }

    @Test
    @DisplayName("6 + 8 = 14")
    void addTwoNrs() {
        Calculator calculator = new Calculator();
        assertEquals(14, calculator.add(6, 8), "6 + 8 should equal 11");
    }

    @Test
    @DisplayName("6 - 8 = -2")
    void subbTwoNrs() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.subb(6, 8), "6 - 8 should equal -2");
    }


}