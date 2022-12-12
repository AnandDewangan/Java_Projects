// Given an array of N elements. In the array, each element is present twice except for 1 element whose frequency in the array is 1. Hence the length of the array will always be odd.
// Find the unique number.

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int x[]=new int[n];
        for(int i=0;i<n;++i) x[i]=sc.nextInt();
        System.out.println(unique(x,n));
    }

    public static int unique(int[] x,int n)
    {
        int result = 0;
        for(int i=0;i<n;i++) result ^= x[i];
        return (result>0 ? result : -1);
    }
}