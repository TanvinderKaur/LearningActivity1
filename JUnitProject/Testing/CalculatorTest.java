import static org.junit.Assert.*;

import org.junit.Test;

import com.ict100.junitprojects.Calculator;

public class CalculatorTest {

	
	@Test
	public void CalulatorTest() {
		//Test for addition
		assertEquals("error in add()", 3, Calculator.addition(1, 2));
		assertEquals("error in add()", -3, Calculator.addition(-1, -2));
		assertEquals("error in add()", 9, Calculator.addition(9, 0));
		
		//Test for subtraction
	    assertEquals("error in subtraction()", 5, Calculator.subtraction(10,5));
	    assertEquals("error in subtraction()", 1, Calculator.subtraction(10,9));
	    assertEquals("error in subtraction()", 3, Calculator.subtraction(10,7));
	    
	  //Test for multiplication
	    assertEquals("error in multiplication()", 50, Calculator.multiplication(10,5));
	    assertEquals("error in multiplication()", 20, Calculator.multiplication(10,2));
	    assertEquals("error in multiplication()", 10, Calculator.multiplication(10,1));
	    
	  //Test for division
	    assertEquals("error in division()", 5, Calculator.division(10,2),0.001);	
	    assertEquals("error in division()", 1, Calculator.division(5,5),0.001);
	    assertEquals("error in division()", 12, Calculator.division(24,2),0.001);
	   
	}

}
