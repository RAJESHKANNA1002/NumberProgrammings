package  NumberPro;


import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		for (int i = 0; i <=num; i++) {
			if (i%3==0 || i%4==0 || i%6==0) {
				System.out.println(i);
			}
			
		}
	}
}
