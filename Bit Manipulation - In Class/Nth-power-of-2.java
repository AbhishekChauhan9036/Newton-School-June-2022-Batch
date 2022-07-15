import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            System.out.println(setBits(n));
            t--;
        }
    }

    private static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
        }
	}