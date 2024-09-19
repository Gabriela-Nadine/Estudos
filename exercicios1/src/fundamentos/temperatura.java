package fundamentos;

public class temperatura {
	public static void main(String[]args) {
		double F= 86;
		double C;
		final double ajuste = 32;
		final double fator= 5/9.0;
		double formula= (F-ajuste)*fator;
		
		System.out.println(formula+" °C");
		
		
		
	}
}
