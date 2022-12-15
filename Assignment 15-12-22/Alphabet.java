// WAP to check the character id an alphabet or not. 
package basic;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		
		if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
			System.out.println("The character is an alphabet");
		}
		else {
			System.out.println("The character is not an alphabet");
		}

	}

}
