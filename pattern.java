// Given an integer N, you have to print the given below pattern for N >= 3.

// Pattern for N = 4:-
// *
// *^*
// *^^*
// *****


import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }

    static void pattern(int N){
        if(N>=3){
            for(int i = 1; i<=N+1; i++){
                if(i==2){
                    continue;
                }
                int x = 0;
                for(int j=1; j<=i; j++){
                    if(i==1 || i==N+1){
                        System.out.print("*");
        
                    }
                    else{
                        x++;
                        if(x==1 || x==i){
                            System.out.print("*");
                        }else{
                            System.out.print("^");
                        }
                    }
                }
                System.out.println();
            }
        }
        }
        
}