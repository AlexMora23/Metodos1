import java.util.*;
public class Metodo2_5{
public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);

	   System.out.println("Ingrese la base del cuadrado: ");
	   int  lado = sc.nextInt();
	multi(lado,lado);

   }
public static void multi(int lado, int area){
	   area= lado*lado;
	   
	   System.out.println("El area del cuadrado es = " + area);
}
}
