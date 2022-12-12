// Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
// Given N-1 elements your task is to find the missing one.

import java.util.*;

class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-1];
        int i=0;
        for(i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }

        int ans =0;
        
        for (i=1; i<=a.length; i++){
            ans = ans ^ i ^ a[i-1];
        }
        ans = ans ^ i;
        System.out.println(ans);
    }
}