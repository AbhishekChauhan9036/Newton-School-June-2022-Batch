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
        int n = sc.nextInt();
        while(n>=1){
            int l = sc.nextInt();
            int find = sc.nextInt();
            int arr [] = new int[l];

            for(int i=0; i<l; i++){
                arr[i] = sc.nextInt();
            }
            boolean isPresent = false;
            for(int i=0; i<l; i++){
                if(arr[i] == find){
                    System.out.print(i+" ");
                    isPresent = true;
                }
            }
            if(!isPresent){
                System.out.print("Not found");
            }
            System.out.println();
            n--;
        }
	}
}
/******************************************************************************************************************************************/
/***********End****************/