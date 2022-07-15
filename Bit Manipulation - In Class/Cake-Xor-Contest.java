// Java program to construct array from
// XOR of elements of given array
import java.io.*; // for handling input/output
import java.util.*;
class Main
{
	public static void constructXOR(int A[], int n)
	{
		int XOR = 0;
		for (int i = 0; i < n; i++)
			XOR ^= A[i];
			
		for (int i = 0; i < n; i++)
			A[i] = XOR ^ A[i];
	}
	
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int [] Arr=new int[n];
		for(int i=0;i<n;i++)
	   { Arr[i]=sc.nextInt();
		
	   }
	   constructXOR(Arr, n);

		for (int i = 0; i < n; i++)
			System.out.print(Arr[i] + " ");
	}
}