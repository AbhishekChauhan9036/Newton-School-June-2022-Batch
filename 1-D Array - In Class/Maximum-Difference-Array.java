/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
	int maxDiff = -1;
	int n =sc.nextInt();
	int [] arr = new int[n];
	for (int i =0; i < n; i++){
		arr[i] = sc.nextInt();
	}
	int []rightMax = new int[n];
	rightMax[n-1] = arr[n-1];
	for(int i = n-2; i>=0; i--)
	   rightMax[i] = Math.max(rightMax[i+1] , arr[i]);
	   int maxDist = Integer.MIN_VALUE;
	   int i = 0 , j = 0;
	   while(i < n && j < n){
		   if(rightMax[j] > arr[i])
		   {
			   maxDist = Math.max(maxDist, j-i);
			   j++;
		   }else
		   i++;
	   }
	   System.out.println(maxDist);
	}
}
/******************************************************************************************************************************************/
/***********End****************/