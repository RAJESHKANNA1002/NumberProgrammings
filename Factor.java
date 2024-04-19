package NumberPro;

public class Factor {
	public static void main(String[] args) {
		
		int a=5,fact=1;//
		for (int i = a; i >=2 ; i--) {//5 ,4
			
			fact*=i;//fact=5x4x3x2x1
		}
		System.out.println(fact);
	}

}
