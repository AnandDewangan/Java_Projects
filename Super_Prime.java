// For a given integer N, super primes are those integers from 1 to N whose multiples (other than themselves) do no exist in the range [1, N].
// Your task is to generate all super primes <= N in sorted order.

// Note: Super primes are not related to primes in any way.
import java.util.*;
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SuperPrimes(n);
    }

    public static void SuperPrimes(int n){
        int a = n/2;
        for(int i=a+1; i<=n; i++ ){
            System.out.print(i+" ");
        }
        }
}
