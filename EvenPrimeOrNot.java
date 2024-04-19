package NumberPro;

import java.util.Scanner;

public class EvenPrimeOrNot {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int num=sc.nextInt();
		String result="Prime";
		
		if(num==0 || num==1)
			result="Neither Prime nor Composite";
		else
			for (int i = 2; i <num; i++) {
				
				if(num%i==0)
				{
					result="Not Prime";
					break;
				}
			}
		System.out.println(result);	
	}

}
