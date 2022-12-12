// You are given the following pseudocode:

// code :
// res = a
// for i = 1 to k
// if i is odd
// res = res & b
// else
// res = res | b

// You are also given the values of a, b and k. Find the value of res.

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    while(T>0){
        T--;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = b;

        if(c==1){
            result = a&b;
        }
        System.out.println(result);
    }
    }
}