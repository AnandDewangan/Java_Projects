// You are given a matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.
// Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to print the modified matrix.

import java.util.*;
import java.io.*;
class Main {
    public static void main (String args[])throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while(t-->0){
        String str[] = br.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int mat[][] = new int[m][n];
        
        for(int i=0; i<m; i++){
            str = br.readLine().split(" ");
            for(int j=0; j<n; j++){
                mat[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==1){
                    for(int k=0; k<n; k++){
                        mat[i][k] = 1;
                    }
                }
            }
        }
         for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
       } 
    
    }
    }
}