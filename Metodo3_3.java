import java.util.Scanner;
public class Metodo3_3 {
	public static void main(String []args){
		int multi = multi();
		System.out.println("El resultado de la multiplicacion es= "+multi);
	}
		public static int multi( ) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Valor x= ");
			int x=sc.nextInt();
			System.out.println("Valor y= ");
			int y=sc.nextInt();
			int multi = x*y;
			return multi;
			
		
}
}
