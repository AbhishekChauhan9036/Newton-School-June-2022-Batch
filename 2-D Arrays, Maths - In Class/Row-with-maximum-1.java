import java.io.*;
import java.util.*;
class Main {
    static int R = 0, C = 0;
    static void fun(int a,int b)
{
    R=a;
    C=b;
}
    static int first(int arr[], int low, int high) {
        if (high >= low) {

            int mid = low + (high - low) / 2;

            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)
                return mid;

            else if (arr[mid] == 0)
                return first(arr, (mid + 1), high);

            else
                return first(arr, low, (mid - 1));
        }
        return -1;
    }

    static int rowWithMax1s(int mat[][]) {

        int max_row_index = 0, max = -1;

        int i, index;
        for (i = 0; i < R; i++) {
            index = first(mat[i], 0, C - 1);
            if (index != -1 && C - index > max) {
                max = C - index;
                max_row_index = i;
            }
        }

        return max_row_index;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        fun(n,m);
        System.out.println(rowWithMax1s(mat));
    }
}