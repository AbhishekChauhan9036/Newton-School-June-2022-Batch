import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static int findMaxPoint(int arr[], int n) {
        if (n == 2) {
            return Math.max(arr[0], arr[1]);
        }
        int ans[] = new int[n / 2];
        for (int i = 0; i < n; i += 4) {
            if (arr[i] >= arr[i + 1]) {
                ans[i / 2 + 1] = arr[i + 1];
                ans[i / 2] = arr[i];
            } else {
                ans[i / 2 + 1] = arr[i];
                ans[i / 2] = arr[i + 1];
            }

            if (arr[i + 2] >= arr[i + 3]) {
                ans[i / 2 + 1] += arr[i + 2];
                ans[i / 2] += arr[i + 3];
            } else {
                ans[i / 2 + 1] += arr[i + 3];
                ans[i / 2] += arr[i + 2];
            }
        }
        return findMaxPoint(ans, n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = (int) Math.pow(2, num);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxPoint(arr, n));

    }
}