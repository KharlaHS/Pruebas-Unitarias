package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calculator = new Calculator();

	private void asserEquals(int i, int addNumbers) {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	void addition() {
		asserEquals(8, calculator.addNumbers(5,  3));
	}

	
	@Test
	void subtract() {
		asserEquals(2, calculator.subtractNumbers(5,  3));
	}
	
	@Test
	void multiply() {
		asserEquals(15, calculator.multiplyNumbers(5,  3));
	}
	
	@Test
	void divide() {
		asserEquals(2, calculator.divideNumbers(6,  3));
	}


}
