import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int findMaxGCD(int arr[], int n)
    {
        int high = 0;
        for (int i = 0; i < n; i++)
            high = Math.max(high, arr[i]);
      
        int divisors[] =new int[high + 1];
      
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j <= Math.sqrt(arr[i]); j++)
            {
                if (arr[i] % j == 0)
                {
                    divisors[j]++;
      
                    if (j != arr[i] / j)
                        divisors[arr[i] / j]++;
                }
            }
        }
      
        for (int i = high; i >= 1; i--)
            if (divisors[i] > 1)
                return i;
        return 1;
    }

	public static void main (String[] args) {
                      // Your code here...
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print(findMaxGCD(arr,n));
	}
}