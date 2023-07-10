package com.app;

import java.util.Scanner;
import com.DAO.CalculatorImplementation;

public class CalculatorShow {

	public static void main(String[] args) {
		CalculatorImplementation ci = new CalculatorImplementation();

		Scanner sc = new Scanner(System.in);

		char ch;
		do {
			System.out.println("....welcome to Calculator....");
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("enter your choice");
			
			System.out.println(
					"1.Addition\n2.SubStraction\n3.Multiplication\n4.Dividation\n5.Area_of_square\n6.Area_of_rectangle\n7.Area_of_triangle\n8.Area_of_circle");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				((CalculatorImplementation) ci).Addition();
				break;
			case 2:
				ci.Substraction();
				break;
			case 3:
				ci.Multiplication();
				break;
			case 4:
				ci.Dividation();
				break;
			case 5:
				ci.AreaOfSquare();
				break;
			case 6:
				ci.AreaOfRectangle();
				break;
			case 7:
				ci.AreaOfTriangle();
				break;
			case 8:
				ci.AreaOfCircle();
				break;

			default:
				System.out.println("invalid option");
			}
			System.out.println("do u want to continue");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("thank you using application.............");

	}

}
