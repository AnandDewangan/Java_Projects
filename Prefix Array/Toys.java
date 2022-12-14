// Sara want to buy a toy and for this purpose she goes to a toy shop, there is a special offer going in the toy shop that is if you buy one toy you can get extra k toys for free now Sara wonders what is the minimum amount of money she need to spend so that she can get all the toys.

// You are given some queries containing values of k you need to print the minimum amount of cost Sara need to spend to get all the toys for each value of k.

import java.util.Scanner;

public class Toys {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int q = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    while(q-->0){
        int k = sc.nextInt();
        System.out.println(findMinimum(arr, n, k));
    }
    }

    static int findMinimum(int arr[], int n, int k){
        Arrays.sort(arr);
        int res = 0;

        for(int i=0; i<n; i++){
            res += arr[i];
            n = n-k;
        }
        return res;
        
    }
}

