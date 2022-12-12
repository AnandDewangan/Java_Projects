
// You are given a number n. Your task is to print the number of prime numbers before that number.

import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T>0){
            T--;
            int N = sc.nextInt();
            int count = 0;
            for(int i=1; i<=N; i++){
                if(isPrime(i)){
                    count++;
                }  
            }
            System.out.println(count);
        }
        // System.out.println();
    }

    static boolean isPrime(int n){
        if(n==1||n==0)return false;
        for(int i=2; i<n; i++){
            if(n%i==0)return false;
        }
        return true;
    }
}