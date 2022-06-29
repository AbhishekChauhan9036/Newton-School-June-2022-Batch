/* Author = Chauhan Abhishek */
/* Codechef Id = abhishekchauha */
/* Codeforces Id = abhishekchauhan903 */
/* GitHub Id = AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.util.*;
import java.io.*;
class Main {
    static String conditional(int n){
    if(n==1){
        return "one";
    }else if(n==2){
        return "two";
    }else if(n==3){
        return "three";
    }else if(n==4){
        return "four";
    }else if(n==5){
        return "five";
    }else{
        return "Greater than 5";
    }
}
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(conditional(n));
    }
}
/******************************************************************************************************************************************/
/***********End****************/