package NumberPro;

import java.util.Scanner;

public class PalindromeOrNot {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		int palin=0;
		int temp=num;
		
		while(num>0)
		{
			palin=palin*10+num%10;//0*10+121%10=1//1*10+12%10=12//12*10+1%10=121
			num/=10;//12
		}
		if(temp==palin)
		{
			System.out.println(temp +" is Palindrome");
		}
		else
			System.out.println(temp + " is not a palindrome");
		
	}
	
	
}
