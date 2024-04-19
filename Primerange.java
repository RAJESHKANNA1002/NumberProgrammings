package NumberPro;

import java.util.Scanner;

public class Primerange {
	
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		

		System.out.println("Enter the start");// getting  start
		
		int start=sc.nextInt();
		
		System.out.println("Enter the end");// end 
			
		int end=sc.nextInt();
			
			boolean result=true; // decalared it result is true
			
			for (int i = start; i < end; i++) {
				
				if(i==0||i==1)// for 0,1 is not a prime number so it is false
				
				{
					System.out.println("Neither prime not composite");
		
					result= false;
				}
			
				else
				{
					result=true;
					for(int j=2 ; j< i; j++) {
						if(i%j==0)
						result =false;
						break;
					}
				}
				if(result)
				{
					System.out.println(i+":Prime");
				}
			
		}

	}
}
