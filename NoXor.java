// We need a problem on xor again. Given an array A of N integers (1- indexed),
//  you need to find the sum of (N- i) xor A[i] for all i from 1 to N.

import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
		long a[] = new long[n];

		for(int i=0;i<n;i++){
			a[i] = scn.nextInt();
		}
	     long sum = 0;
		 for(int i=1;i<n+1;i++){	  
			sum = sum +((n-i) ^ a[i-1]);
		}
		System.out.println(sum);
    }
}