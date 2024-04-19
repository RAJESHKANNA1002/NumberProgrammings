package NumberPro;
import java.util.*;
public class Odd {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num= sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			if (i%2==1) {
				System.out.println(i);
			}
		}
	}
}
