package NumberPro;
import java.util.Scanner;
public class Tables {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num= sc.nextInt();
		int end= sc.nextInt();
		
		for (int i = 1; i <=end; i++) {
			
			System.out.println(num+"x"+i+"="+num*i);
		}
		
	}

}
