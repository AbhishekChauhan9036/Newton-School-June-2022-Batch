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
        Long n, p, k; 
        n = sc.nextLong();
        p = sc.nextLong();
        k = sc.nextLong();
	    Long l = 1l, r = 10000000000l;
 
        while(l + 1 < r){
            Long m = (l + r) / 2;
            if ( get(m, k) + get(m, n - k + 1) - m > p)
                r = m;
            else l = m;
	}
 
	System.out.println((Long)l);
	}

    public static Long get(Long ed, Long cnt){
        Long d = cnt;
        if (d > ed) 
            d = ed;
        cnt -= d;
       return cnt + d * (2 * ed - d + 1) / 2;
}
}
/******************************************************************************************************************************************/
/***********End****************/