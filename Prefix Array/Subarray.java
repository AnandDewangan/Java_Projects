// Given an array, A of length N, find the contiguous subarray within A which has the largest sum.
import java.util.Scanner;

class Subarry{
    public static void main (String[] args) {
                      // Your code here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            long arr[] = new long[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            System.out.println(subArray(arr, n));

        }
    }

    static long subArray(long arr[], int n){
        long curr_sum=0;
        long max_sum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            curr_sum += arr[i];
            curr_sum = Math.max(curr_sum, arr[i]);
            max_sum = Math.max(curr_sum, max_sum);
            
        }
        return max_sum;
    }
}