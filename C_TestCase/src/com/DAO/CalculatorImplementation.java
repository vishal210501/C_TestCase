package com.DAO;

import java.util.Scanner;
import com.bean.Calculatorinfo;

public class CalculatorImplementation implements CalculatorDetails {

	Calculatorinfo Calculator = new Calculatorinfo();

	Scanner sc = new Scanner(System.in);

	public void Addition() {
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Addition :" + (num1 + num2));

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
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Area_Of_Square :" + (num1 * num1));

	}

	@Override
	public void AreaOfRectangle() {
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Area_Of_Rectangle :" + (num1 * num2));

	}

	@Override
	public void AreaOfTriangle() {
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Area_Of_Triangle :" + ((num1 * num2) / 2));

	}

	@Override
	public void AreaOfCircle() {
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
        System.out.println("Area_Of_Circle :" + (1.73 * num1 * num1));

	}

}
