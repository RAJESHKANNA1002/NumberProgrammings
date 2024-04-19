package NumberPro;

import java.util.Scanner;

public class EvenPrimeNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String rev="";
		
			for(int i=s.length()-1;i<=0;i--) {
				rev=rev+s.charAt(i);
			}
			if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palinrdrome");
			}else {
				System.out.println("Not Palindrome");
			}
		
		
		}
	
}
