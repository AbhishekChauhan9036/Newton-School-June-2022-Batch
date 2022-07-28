import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void sortedSquares(int[] nums) {

      int arr[] = new int[nums.length];
      int i = 0, j = nums.length - 1;
      int p = j;
       
      while (i <= j) {
         if (Math.abs(nums[i]) <= Math.abs(nums[j])) {
            arr[p--] = nums[j] * nums[j];
             j--;
         } else {
            arr[p--] = nums[i] * nums[i];
            i++;
         }
      }

      for(i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }
      System.out.println();

   }
    public static void main (String[] args)throws IOException{
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-- > 0){
          int n = Integer.parseInt(br.readLine());
          int arr[] = new int[n];
          String srr[] = br.readLine().trim().split(" ");
          for(int i = 0; i < n; ++i)
               arr[i] = Integer.parseInt(srr[i]);
          
         sortedSquares(arr);
          
     }
   }
}