// WAP to check the character is a vowel or a consonant.
package basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character");
		char c = sc.next().charAt(0);
		
		if ((c == 'a'|| c=='e'|| c=='i'||c=='o'|| c=='u')||(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')) {
			System.out.println("character is a vowel");
		}
		else {
			System.out.println("character is a consonant");
		}

	}

}
