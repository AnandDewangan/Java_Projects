// Given an array A of integers, find the number of subarrays with an odd sum.

import java.util.Scanner;

public class OddSum {
  
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print(numOfSubarrays(arr, n));
    }

    static long numOfSubarrays(int a[], int n){
        long c_odd = 0, result = 0;
        boolean odd = false;
 
        // First find number of odd sum subarrays starting
        // at 0th index
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 1)
                odd = !odd;
            if (odd)
                c_odd++;
        }
 
        // Find number of odd sum subarrays starting at ith
        // index add to result
        for (int i = 0; i < n; i++) {
            result += c_odd;
            if (a[i] % 2 == 1)
                c_odd = (n - i - c_odd);
        }
        return result;
    }
}

