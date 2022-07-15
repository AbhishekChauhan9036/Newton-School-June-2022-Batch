import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N >=100 && N <=150) {
            if (N % 2 == 0) {
                System.out.println("EvenRaj");
            } else if (N % 2 != 0) {
                System.out.println("OddRaj");
            }
        }else if (N > 150 && N <= 180){
            if (N % 2 == 0) {
                System.out.println("EvenAjay");
            } else if (N % 2 != 0) {
                System.out.println("OddAjay");
            }

        }else {
            System.out.println("Wrong");
        }
	}
}