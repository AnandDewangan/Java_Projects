// Find factorial of a given number N.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Factorial(n));
    }
    static int Factorial(int N){
        if(N==0){
            return 1;
        }
        return N*Factorial(N-1);
        }
}