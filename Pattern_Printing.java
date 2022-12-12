// Given a positive integer N, your task is to print a right angle triangle pattern of consecutive numbers of height N.

// For N = 5, the following pattern is printed.
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }

    static void pattern(int n){
        int i,j;
        for(i=1;i<n+1;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        }
}