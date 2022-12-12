// Give integer values M and N. Using the character ‘*’ draw a rectangle of height M and breadth N.
import java.util.*;
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int M = sc.nextInt();
     int N = sc.nextInt();
     for(int i=1; i<=M; i++){
         for(int j=1; j<=N; j++){
             if(i>=2&& j>=2 && i<=M-1 && j<=N-1){
                 System.out.print(" ");
             }
             else{
                 System.out.print("*");
             }
            
         }
         System.out.println();
     }
    }
}