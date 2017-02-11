import java.util.Scanner;
public class Metodo2_2 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor de x");
		int x = sc.nextInt();
		System.out.println("Ingrese el valor de y");
		int y = sc.nextInt();
		multi(x,y);
	}
		public static void multi(int x, int y ) {
			int mult = x*y;
			System.out.println("El resultado de la multiplicacion es= "+mult);
		
}
}
