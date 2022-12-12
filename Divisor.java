// Given an integer N, the task is to find the number of divisors of N which are divisible by 2.

import java.util.*;

class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int count =0,i;
    while(t>0){
            int n = sc.nextInt();
            for(i=1; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    if(i%2==0){
                        count++;
                    }
                    if((n/i)%2==0){
                        count++;
                    }
                }
            }
            i--;
            if((i*i==n) && (i%2==0)){
                count--;
            }
            System.out.println(count);
            count = 0;

            t--;
    }
    }
    
}