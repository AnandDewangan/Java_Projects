import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(maxSum(arr,n,k));

    }
    public static int maxSum(int arr[], int n, int k){
        if (n < k){
            return -1;
        }

        int res = 0;
        for (int i=0; i<k; i++){
            res += arr[i];
        }

        int curr_sum = res;
        for (int i=k; i<n; i++){
            curr_sum += arr[i] - arr[i-k];
            res = Math.max(res, curr_sum);
        }
        return res;
    }
}