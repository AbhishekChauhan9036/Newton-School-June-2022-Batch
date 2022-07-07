/* Author = Chauhan Abhishek */
/* Codechef Id = https://www.codechef.com/users/abhishekchauha */
/* Codeforces Id = https://codeforces.com/profile/abhishekchauhan903 */
/* Newton School Id = https://my.newtonschool.co/user/abhishekchauhan9036/ */
/* GitHub Id = https://github.com/AbhishekChauhan9036 */
/* Language = JAVA */
/* Address = Ballia,UP,INDIA (221716)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.util.*;
import java.io.*;
public class Main {
public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-->0) {
			int n = Integer.parseInt(br.readLine());

			int max, max2, max3;
			max3 = max = max2 = -1;
			int x = 0;
			 String srr[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				x =Integer.parseInt(srr[i]);
				if (x > max) {
					max3 = max2;
					max2 = max;
					max = x;
				} else if (x > max2) {
					max3 = max2;
					max2 = x;
				} else if (x > max3)
					max3 = x;
			}
			System.out.println(max + " " + max2 + " " + max3);
			
		}
    }
}
/******************************************************************************************************************************************/
/***********End****************/