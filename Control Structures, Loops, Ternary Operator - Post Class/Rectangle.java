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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }else if(j==1 || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
/******************************************************************************************************************************************/
/***********End****************/