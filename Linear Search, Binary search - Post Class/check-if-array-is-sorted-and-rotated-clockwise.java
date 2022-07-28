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
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine());
		    int arr[] = new int[(int)n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(long i=0; i<n; i++){
		        arr[(int)i] = Integer.parseInt(inputLine[(int)i]);
		    }
		long mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE; 
        long max_index = 0, min_index = 0;
        for(long i=0; i<n; i++){
            if(maxi < arr[(int)i]){
                maxi = arr[(int)i];
                max_index = i;
            }
            if(mini > arr[(int)i]){
                mini = arr[(int)i];
                min_index = i;
            }
        }
        
        int flag = 0;
        if(max_index == min_index -1)
            flag = 1;
        else if(min_index == max_index - 1)
            flag = -1;
        
        if(flag == 1){
            for(long i = 1; flag==1 && i<=max_index; ++i){
                if(arr[(int)i-1] >= arr[(int)i])
                    flag = 0;
            }
            for(long i = min_index+1; flag==1 && i<n; ++i){
                if(arr[(int)i-1] >= arr[(int)i])
                    flag = 0;
            }
            if(arr[0]<=arr[(int)n-1])
                flag = 0;
        } else if(flag == -1){
            for(long i = 1; flag ==-1 && i<=min_index; ++i){
                if(arr[(int)i-1] <= arr[(int)i])
                    flag = 0;
            }
            for(long i = max_index+1; flag==-1 && i<n; ++i){
                if(arr[(int)i-1] <= arr[(int)i])
                    flag = 0;
            }
            if(arr[0]>=arr[(int)n-1])
                flag = 0;
        }
        
        if(flag == 0)
            System.out.println("No");
        else
            System.out.println("Yes");
		}
	}
}
/******************************************************************************************************************************************/
/***********End****************/