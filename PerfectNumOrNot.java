package NumberPro;

import java.util.Iterator;

public class PerfectNumOrNot {

	public static void main(String[] args) {
		
		int num=29,sum=0;
		for (int i = 1; i < num; i++) {
			if(num%i==0)
				sum+=i;
			
		}
		if(sum==num)
		{
			System.out.println("Perfect");
		}
		else
			System.out.println("Not Perfect");
	}
}
