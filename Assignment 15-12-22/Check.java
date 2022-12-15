// WAP to check weather a character is alphabet or a digit or a special character 
package basic;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a character");
		char c = sc.next().charAt(0);
		
		if((c>='a'&& c<='z')||(c>='A'&& c<='Z')) {
			System.out.println("Character is a Alphabet");
		}
		else if(c>='0' && c<='9') {
			System.out.println("character is a digit");
		}
		else {
			System.out.println("Character is a special character");
		}

	}

}
