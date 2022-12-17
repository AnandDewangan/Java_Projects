
// Given an integer N. The task is to find the square root of N. If N is not a perfect square, then return floor(√N).
import java.util.Scanner;

class Sqrt {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            System.out.println(sqrtBinary(n));
        }
    }

    static long sqrtBinary(long n) {
        long start = 1;
        long end = n;
        long res = 0;
        while (start <= end) {
            long mid = (start + end) / 2;

            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
                res = mid;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}