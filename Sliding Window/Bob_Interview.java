// Bob applied for a company. There are N rounds of interview. He can predict the result of each rounds based on his skill and type of round. Result of each round was stored in a binary array "results". Where results[ i ] = 1 means he can clear that round otherwise not. For getting selected one has to clear at least ''X" round(s) of interview.

// He has to select any K contiguous interview rounds which he wants to appear for. Selection decision will be made based on these rounds. Help bob find whether he can be selected or not.

import java.util.Scanner;

class Bob_Interviews{
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int x = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = resultBob(arr, n, k, x);
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    static boolean resultBob(int arr[], int n, int k, int x){

        int window_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            window_sum += arr[i];
        }
        max_sum = window_sum;
        for(int i=k; i<n; i++){
            window_sum += (arr[i]-arr[i-k]);
            max_sum = Math.max(window_sum, max_sum);
        }
        if(max_sum>=x){
            return true;
        }
        return false;
    }
}
