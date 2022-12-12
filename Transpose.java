// You are given a NxN matrix. You need to find the transpose of the matrix.
// The matrix is of form:
// a b c ...
// d e f ...
// g h i ...
// ...........
// There are N elements in each row.

import java.util.*;
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[][] = new int[N][N];
    for(int i = 0; i<N;i++){
        for(int j=0; j<N;j++){
            int input = sc.nextInt();
            a[i][j] = input;
        }
    }
    for(int i=0; i<N;i++){
        for(int j=0; j<N; j++){
            System.out.print(a[j][i]+" ");
        }
        System.out.println();
    }
    }
}