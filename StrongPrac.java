package NumberPro;
import java.util.Scanner;
public class StrongPrac {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();//128
	int sum=0;
	for(int i=1;i<num;i++) {
		if(num%i==0)
			sum+=i;
		
	}
	if(sum==num)
		System.out.println("Perfect");
	else
		System.out.println("Not perfect");
}
}