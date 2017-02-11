import java.util.*;
public class Metodo1_1 {
	public static void main(String []args){
		multi();
	}
		public static void multi( ) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese el valor de x");
			int x = sc.nextInt();
			System.out.println("Ingrese el valor de y");
			int y = sc.nextInt();
			int mult = x*y;
			System.out.println("El resultado de la multiplicacion es= "+mult);
		
}
}
