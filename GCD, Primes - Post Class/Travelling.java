import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
    public static void main (String[] args) {
                      Scanner scn = new Scanner(System.in);
                      int n= scn.nextInt();
                      int s = scn.nextInt();
                      int a[]= new int[n];
                       int arr[]= new int[n];
                      for(int i=1; i<arr.length;i++)
                      {
                          arr[i]=scn.nextInt();
                      }
                      for(int i=1; i<arr.length;i++)
                      {
                          int o=0;
                      o=arr[i]-s;
                      o= Math.abs(o);
                      a[i]=o;
                      }
                    int temp= gcd(a[0],a[1]);
                      for(int i=1; i<n-1; i++)
                      {
                       temp=gcd(temp,a[i+1]);
                      }
                     System.out.println(temp);
            }
    }