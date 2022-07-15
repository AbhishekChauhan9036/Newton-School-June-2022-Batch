import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import static java.lang.Math.*;

class Main {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		double n =  sc.nextDouble();
		double R =  sc.nextDouble();
		double r =  sc.nextDouble();
		
		if(r>R || n>1&& (R-r)*sin(acos(-1.0)/n)+1e-8<r)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}            
	}
}