import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int ad=1;
	    for(int i=n;i>=Math.sqrt(n);i--){
         if(prime(i)){
             System.out.println(i);
             break;
         }else if(prime(n-ad)){
			 System.out.println(n-ad);
             break;
		 }else if(prime(n+ad)){
			 System.out.println(n+ad);
             break;
		 }
		 ad++;
     }

	}
	static boolean prime(int n){
        if(n<=1)
           return false;
for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
              return false;
        }

        return true;
    }
}