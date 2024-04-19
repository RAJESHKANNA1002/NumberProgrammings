package NumberPro;

import java.util.Scanner;

public class Prefectnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		//
		int tot=0;
		for (int i = 1; i < num ; i++) {
		
			if(num%i==0) {
				tot=tot+i;
				
			}
				
			
		}
		String result=(tot==num)?"Prefect":"Not Perfect";
		System.out.println(result);
	}
}
