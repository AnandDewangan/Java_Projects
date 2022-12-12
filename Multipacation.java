// Since this will be a functional problem, you don't have to take input. 
// You just have to complete the function Multiply() that takes the integer M and N as a parameter.
import java.util.Scanner;

/**
 * Multipacation
 */
public class Multipacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(Multiply_by_recursion(m, n));
    }

    static int Multiply_by_recursion(int M, int N) {

        int sum = 0;
        while (N > 0) {
            N--;
            sum = sum + M;
        }
        return sum;
    }

}
