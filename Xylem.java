package NumberPro;

import java.util.Scanner;

public class Xylem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num=sc.nextInt();//143
		 int last=num%10,mid=0;//last =3,mid=0
		 num/=10;//num=14
		while(num>9)//14>9 2.fail
		{
			mid+=num%10;//0+14%10=0+4=4
			num/=10;//num=1
		}		
		if((num+last)==mid)
		{
			System.out.println("Xylem");
			
		}
		else
			System.out.println("pheolem");
	}
}
