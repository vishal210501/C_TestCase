package Application;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;

import com.DAO.CalculatorImplementation;


class CalculatorShow {

	CalculatorImplementation ci=new CalculatorImplementation();
	@Test
	void Add() {
		int output=ci.Addition1(10,20);
		assertEquals(30, output);
		
	}
	@Test
	void Sub() {
		int output=ci.Substraction1(20,10);
		assertEquals(10, output);
	}
	@Test
	void Multi() {
		int output=ci.Multiplication1(5,6);
		assertEquals(30, output);
	}
	@Test
	void Div() {
		int output=ci.Dividation1(10,5);
		assertEquals(2, output);
	}
	void AreaofSQ() {
		int output=ci.AreaOfSquare1(4);
		assertEquals(16, output);
	}
	void AreaofRECT() {
		int output=ci.AreaOfRectangle1(5, 3);
		assertEquals(15, output);
	}
	void AreaofTRI() {
		int output=ci.AreaOfTriangle1(3,4);
		assertEquals(6, output);
	}
	void AreaofCIR() {
		int output=ci.AreaOfCircle1(2);
		assertEquals(6, output);
	}
	

}
