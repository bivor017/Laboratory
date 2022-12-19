package basic;

import java.util.Scanner;

public class Calculator {
	
	public static int addition(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static int substraction(int a, int b) {
		int c;
		if(a>b) {
			c = a - b;
		}
		else {
			c = b - a;
		}
		return c;
	}
	public static int multiplication(int a,int b)
	{
		int result = a*b;
		return result;
	}
	public static float division(float a, float b) {
		float res2 = a/b;
		return res2;
	}
	
	public static void main(String[] args) {
		
		int choice,num1,num2,res;
		float num3,num4,res2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which operarion you want to perform");
		System.out.println("1)Addition \n2)Substraction \n3)Multiplication\n4)Division");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the first number");
			num1 = sc.nextInt();
			System.out.println("Enter the second number");
			num2 = sc.nextInt();
			res= Calculator.addition(num1,num2);
			System.out.println(num1+" + " +num2+" = "+res);
			break;
		case 2:
			System.out.println("Enter the first number");
			num1 = sc.nextInt();
			System.out.println("Enter the second number");
			num2 = sc.nextInt();
			res = Calculator.substraction(num1, num2);
			System.out.println(num1+" - " +num2+" = "+res);
			break;
		case 3:
			System.out.println("Enter the first number");
			num1 = sc.nextInt();
			System.out.println("Enter the second number");
			num2 = sc.nextInt();
			res = Calculator.multiplication(num1, num2);
			System.out.println(num1+" x " +num2+" = "+res);
			break;
		case 4:
			System.out.println("Enter the first number");
			num3 = sc.nextFloat();
			System.out.println("Enter the second number");
			num4 = sc.nextFloat();
			res2 = Calculator.division(num3, num4);
			System.out.println(num3+" / " +num4+" = "+res2);
			break;
		}
	}

}
