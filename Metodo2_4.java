import java.util.Scanner;
public class Metodo2_4 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor de x");
		double x = sc.nextInt();
		System.out.println("Ingrese el valor de y");
		double y = sc.nextInt();
		dividir(x,y);
	}
		public static void dividir(double x, double y ) {
			double div = x/y;
			System.out.println("El resultado de la divicion es= "+div);
		
}
}
