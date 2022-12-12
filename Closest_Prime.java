// Given an integer N, find the closest prime number to N. If there are multiple print the smaller one.

import java.util.*;
class Closest_Prime {
     public static int Pr(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return -1;
            }
        }
        return 1;
    }
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int i, diff1 =0, diff2=0, num1=0, num2=0;

     if(n==1){
         System.out.print(2);
     }
     else{
         for(i=n;;i++){
             if(Pr(i)==1){
                 diff1 = i-n;
                 num1 = i;
                 break;
             }
         }
         for(i=n;;i--){
             if(Pr(i)==1){
                 diff2 = n-i;
                 num2 = i;
                 break;
             }
         }
         if(diff1>=diff2){
             System.out.print(num2);
         }
         else{
             System.out.print(num1);
         }
     }
    }
}
