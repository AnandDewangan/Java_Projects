// You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.

import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int row = sc.nextInt();
            int col = sc.nextInt();
            int a[][] = new int[row][col];

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    int input = sc.nextInt();
                    a[i][j]= input;
                }
            }
            for(int i=0;i<col;i++){
                System.out.print(a[0][i]+" ");
            }
            for(int i=1; i<row;i++){
                System.out.print(a[i][col-1]+" ");
            }
            if(row>1){
                for(int i=col-2; i>=0;i--){
                    System.out.print(a[row-1][i]+" ");
                }
            }
            if(col>1){
                for(int i=row-2;i>0;i--){
                    System.out.print(a[i][0]+" ");
                }
            }
            System.out.println();
            T--;
        }
        
    }
}