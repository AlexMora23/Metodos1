import java.util.Scanner;
public class Metodo4_4 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor x= ");
		double x=sc.nextInt();
		System.out.println("Valor y= ");
		double y=sc.nextInt();
		double div = div(x,y);
		System.out.println("El resultado de la divicion es= "+div);
	}
		public static double div(double x, double y) {
			
			double div = x/y;
			return div;
			
		
}
}
