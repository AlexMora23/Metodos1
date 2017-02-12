import java.util.Scanner;
public class Metodo3_4 {
	public static void main(String []args){
		double div = div();
		System.out.println("El resultado de la divicion es= "+div);
	}
		public static double div( ) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Valor x= ");
			double x=sc.nextInt();
			System.out.println("Valor y= ");
			double y=sc.nextInt();
			double div = x/y;
			return div;
			
		
}
}
