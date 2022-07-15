import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this clas
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		while(n>0){
			int x = n%2;
			if(x==1){count++;}
			n = n/2;
		}
		if(count%2==0){System.out.print("Yes");}
		else{System.out.print("No");}
	}
}