import java.util.Scanner;
public class Metodo4_3 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor x= ");
		int x=sc.nextInt();
		System.out.println("Valor y= ");
		int y=sc.nextInt();
		int multi = multi(x,y);
		System.out.println("El resultado de la multiplicacion es= "+multi);
	}
		public static int multi(int x, int y) {
			
			int multi = x*y;
			return multi;
			
		
}
}
