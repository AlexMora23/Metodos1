
import java.util.*;
import java.text.*;
public class Metodo1_5{
public static void main(String[] args){
	area();

   }
public static void area(){
	double radio, pi=3.14, AREA;
	   
	   Scanner sc = new Scanner(System.in);
	   DecimalFormat formato= new DecimalFormat("##.#");

	   System.out.println("Ingrese el radio del circulo: ");
	   radio = sc.nextDouble();
	   AREA = (pi)*(radio*radio);
	   
	   System.out.println("El area del circulo es = " + formato.format(AREA));
}
}
