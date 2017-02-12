import java.util.Scanner;
public class Metodo4_5{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	   System.out.println("Ingrese la base del cuadrado: ");
	   int  lado = sc.nextInt();
	int area = area(lado,lado);  
	System.out.println("El area del cuadrado es = " + area);
	
   }
public static int area(int lado, int area){
	 
	area = lado*lado;
	return area; 
	
	      
}
}
