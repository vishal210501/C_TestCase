package com.DAO;

import java.util.*;
import com.bean.Calculatorinfo;

public class CalculatorImplementation implements CalculatorDetails {

	Calculatorinfo Calculator ;
                 
	public CalculatorImplementation() {
		Calculator=new Calculatorinfo();
	}
	
	Scanner sc = new Scanner(System.in);

	public void Addition() {
		System.out.println("enter the first number");
		int num1= sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Addition :" + (num1+ num2));

	}

	@Override
	public void Substraction() {
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Substraction :" + (num1 - num2));

	}

	@Override
	public void Multiplication() {
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Multiplication :" + (num1 * num2));

	}

	@Override
	public void Dividation() {
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Multiplication :" + (num1 / num2));

	}

	@Override
	public void AreaOfSquare() {
		System.out.println("enter the side of square");
		int num1 = sc.nextInt();
		System.out.println("Area_Of_Square :" + (num1 * num1));

	}

	@Override
	public void AreaOfRectangle() {
		System.out.println("enter the length of rectangle");
		int num1 = sc.nextInt();
		System.out.println("enter the breadth of rectangle");
		int num2 = sc.nextInt();
		System.out.println("Area_Of_Rectangle :" + (num1 * num2));

	}

	@Override
	public void AreaOfTriangle() {
		System.out.println("enter the base of triangle");
		int num1 = sc.nextInt();
		System.out.println("enter the height of triangle");
		int num2 = sc.nextInt();
		System.out.println("Area_Of_Triangle :" + ((num1 * num2) / 2));

	}

	@Override
	public void AreaOfCircle() {
		System.out.println("enter the radius of circle");
		int num1 = sc.nextInt();
        System.out.println("Area_Of_Circle :" + (1.73 * num1 * num1));

	}

	public int Addition1(int i, int j) {
		
		return i+j;
	}
	public int Substraction1(int i, int j) {

		return i-j;
	}

	public int Multiplication1(int i, int j) {
	
		return i*j;
	}
	public int Dividation1(int i, int j) {
		
		return i/j;
	}
	public int AreaOfSquare1(int i) {

		return 4*i;
	}

	public int AreaOfRectangle1(int i, int j) {
		
		return i*j;
	}

	public int AreaOfTriangle1(int i, int j) {
	
		return (i*j)/2;
	}
	public int AreaOfCircle1(int i) {
		
		return (int) (1.73*i*i);
	}


}
