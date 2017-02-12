import java.util.Scanner;
public class Metodo3_5{
public static void main(String[] args){
	int area = area();  
	System.out.println("El area del cuadrado es = " + area);
	
   }
public static int area(){
	 Scanner sc = new Scanner(System.in);
	   System.out.println("Ingrese la base del cuadrado: ");
	   int  lado = sc.nextInt();
	int area= lado*lado;
	return area; 
	
	      
}
}
