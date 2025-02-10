package com.calculator;

import java.util.Scanner;

public class BasicCalculator {
	
	public static void main(String[] args) {
		
		String str = "Hi";
		String str2 = "Bye";
		String st3 ="Hello";
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		double number1;
		double number2;
		char operator;
		double result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		
		number1 = sc.nextDouble();
		
		System.out.println("Enter number 2 : ");
		
		number2 = sc.nextDouble();
		
		System.out.println("Enter an operator : + , - , * , /");
		
		operator = sc.next().charAt(0);
		
		while(operator != '+' && operator != '-' && operator != '*' && operator != '/') {
			System.out.println("You have entered incorrect operator ");
			System.out.println("Enter an operator : + , - , * , /");
			operator = sc.next().charAt(0);
		}
		
		switch(operator) {
			
		case '+':
			result = number1+number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;
		
		case '-':
			result = number1-number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;
		
		case '*':
			result = number1*number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;
		
		case '/':
			result = number1/number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;
		
		default :
			System.out.println("You have entered wrong input");
		}
		
		sc.close();
	}
}
