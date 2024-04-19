package  NumberPro;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t\tEnter a number:");
		int num=sc.nextInt();//153
		int temp=num;//153
		int sum=0;
		int last=0;
		int count=0;//3
		int product=1;
		while (num>0)
		{
			num=num/10;
			count++;
		}
		num=temp;//153
		while(num>0)//153
		{
			last=num%10;//3
			for(int i=1;i<=count;i++)//
			{
				product*=last;//1x3=3,3x3=9,9x3=27
				
			}
			sum+=product;
			product=1;
			num=num/10;
		}
		String res=(temp==sum)?"Armstrong":"Not Armstrong";
		System.out.println(res);
	}
	
}
