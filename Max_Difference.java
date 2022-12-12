// Given an array of integers of size N, your task is to find the maximum parity index of this array.
// Parity Index is the maximum difference between two indices i and j (1 <= i < j <= N) of an array A such that Ai < Aj.

import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxDiff = -1;
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
          arr[i] = scan.nextInt();
        }
        int []rightMax = new int[n];
        rightMax[n-1]= arr[n-1];
        for(int i = n-2; i>=0; i--)
          rightMax[i] = Math.max(rightMax[i+1] , arr[i]);
    
        int maxDist = Integer.MIN_VALUE;
        int i = 0, j = 0;
        while(i < n && j < n)
        {
          if(rightMax[j] > arr[i])
          {
            maxDist = Math.max( maxDist, j-i );
            j++;
          }
          else
            i++;
        }
      System.out.println(maxDist);
    }
}