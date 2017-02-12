import java.util.*;
public class Metodo3_2 {
	public static void main(String []args){
		int resta = resta();
		System.out.println("El resultado de la resta es= "+resta);
	}
		public static int resta( ) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Valor x= ");
			int x=sc.nextInt();
			System.out.println("Valor y= ");
			int y=sc.nextInt();
			int resta = x-y;
			return resta;
			
		
}
}
