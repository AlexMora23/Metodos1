import java.util.*;
public class Metodo2_3 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el valor de x");
		int x=sc.nextInt();
		System.out.println("Ingrese el valor de y");
		int y= sc.nextInt();
		restar(x,y);
	}
		public static void restar(int x, int y) {
			int resta = x-y;
			System.out.println("El resultado de la resta es= "+resta);
		
}
}
