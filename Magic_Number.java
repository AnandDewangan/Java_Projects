// A magic number is a natural number that contains both the digits 7 and 9 in it. For eg:- 79, 879, 53729 etc.
// Given a number N, your task is to find the closest Magic number from the given number N.

import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(MagicNumber(n));
    }

    static boolean check(int N) {
        boolean seven = false;
        boolean nine = false;
        while (N > 0) {
            int digit = N % 10;
            if (digit == 7) {
                seven = true;
            }
            if (digit == 9) {
                nine = true;
            }
            N = N / 10;
        }
        if (seven && nine) {
            return false;
        } else {
            return true;
        }
    }

    static int MagicNumber(int N) {
        // Enter your code here
        int i = 0;
        while (check(N - i) == true && check(N + i) == true) {
            i++;
        }
        if (check(N - i) == false) {
            return N - i;
        } else {
            return N + i;
        }
    }
}