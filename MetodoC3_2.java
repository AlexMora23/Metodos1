
public class MetodoC3_2{
	public static void main(String args[]){
	    int x = x();
		int y = y();
		String multi = "El resultado es "+multi(x,y);
		System.out.println(multi);
	}
	public static int multi(int a, int b){
		int multi= a*b;
		return multi;
		
	}
	public static int x(){
		return 6;
	}
	public static int y(){
		return 7;
	}
}
