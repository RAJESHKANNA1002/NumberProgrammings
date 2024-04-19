package NumberPro;

import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//user input= 145
		int temp=num; //temp=145;
		int sum=0;
		int fact=1;
		while(num>0)//145>0=true,2nd  14>0 true, 3rd 1>0 true . This loop will execute 3 times; 
		{
			int last=num%10;//1st last=5, 2nd last=4;, 3rd last =1
		for (int i=last;i>=2;i-- )//1st last=5 , 2nd last =4, 3rd last=10
		{
			fact=fact*i;//1st 5 ,2nd 20 ,3rd 60, 4th 120// fact=120;
						//1st 4 2nd 12, 3rd 24, 
		}
		sum=sum+fact;//1st sum=0+120,2nd sum=120+24=144;sum=144+1=145;
		num=num/10;//num=14,num=1
		fact=1; // assume 1,
		}
		String result=(sum==temp)?"Strong":"Not Strong";
		System.out.println(result);
}
}
