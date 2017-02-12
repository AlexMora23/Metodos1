import java.util.Scanner;
public class Metodo4_2 {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor x= ");
		int x=sc.nextInt();
		System.out.println("Valor y= ");
		int y=sc.nextInt();
		int resta = resta(x,y);
		System.out.println("El resultado de la resta es= "+resta);
	}
		public static int resta(int x, int y) {
			
			int resta = x-y;
			return resta;
			
		
}
}
