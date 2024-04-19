package  NumberPro;

import java.util.Scanner;

public class Demo1 {

	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
	
		int num= sc.nextInt();
		if(num==0 || num==1)
		{
			System.out.println("Not prime");
		}
		else if(num>=1)
		{
			for(int i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.println("not prime");
				}
				else
				{
					System.out.println("Prime");

				}

			}
					}
		
	}
}
