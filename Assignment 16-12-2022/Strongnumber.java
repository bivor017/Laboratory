package basic;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		int num,temp,fact,rem,sum=0;
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		temp=num;
		
		while(num!=0) 
		{
			rem=num%10;
			fact =1;
			
			for(int i =1;i<=rem;i++) 
			{
				fact = fact * i;
			}
			sum = sum + fact;
			num = num/10;
		}
		if(temp == sum)
		{
			System.out.println(temp+" is a strong number");
		}
		else
			System.out.println(temp+" is not a strong number");

	}

}
