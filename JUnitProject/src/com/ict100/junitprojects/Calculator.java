package com.ict100.junitprojects;

public class Calculator {
	
	public static int addition (int num1, int num2)
	{
		return num1 + num2;
    }

	public static int subtraction (int num1, int num2)
	{
		return num1 - num2;
    }
	public static int multiplication (int num1, int num2)
	{
		return num1 * num2;
    }

	public static double division (double num1, double num2)
	{
		if(num2 ==0) {
			throw new IllegalArgumentException("Number never divisible by zero");
		}
		return num1 / num2;
    }

}