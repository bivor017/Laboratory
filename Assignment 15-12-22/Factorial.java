//WAP to print the factorial value from 1 to 10.
package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial=1;
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);

	}

}
