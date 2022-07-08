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
    int n;
    n = sc.nextInt();
    int arr[]=new int[n];
  
    for(int i =1 ;i<arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    int sum1 =0;
    for(int i=1 ; i< arr.length; i++){
        sum1=sum1+arr[i];
    }
    int sum2=0;
    for(int i= 1 ; i<=n ;i++){
        sum2= sum2+i;

    }
    System.out.println(sum2-sum1);
	}
}
/******************************************************************************************************************************************/
/***********End****************/