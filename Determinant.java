// You are given a 2X2 square matrix. You need to find the determinant of the matrix.
import java.util.*;
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int a[][] = new int[2][2];
     int determinant;
     for(int i=0; i<2; i++){
         for(int j=0; j<2; j++){
             int input = sc.nextInt();
             a[i][j] = input;
         }

     }
     determinant = (a[0][0])*(a[1][1])-(a[0][1])*(a[1][0]);
     System.out.print(determinant);
    }
}