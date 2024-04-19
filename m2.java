package NumberPro;

public class m2 extends MethodShadow{

	public static void dance() {
		System.out.println("Hippop");
}
	public static void main(String[] args) {
		MethodShadow ref=new m2();
		ref.dance();
	}
	
}
