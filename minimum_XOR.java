// Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.


import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int min = Integer.MAX_VALUE;
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0; i<arr.length-1; i++){
        
        int xor = (arr[i] ^ arr[i+1]);
        if(xor<min){
            min = xor;
        }
        else if(xor==min){
            min = xor;
        }
    }
    System.out.print(min);
    }
}