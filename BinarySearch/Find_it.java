// Given an integer K, find a positive integer x such that K = x2 + 3*x. If no such positive integer x exists, print -1.

import java.util.Scanner;

public class Find_it {
    public static void main(String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();

        System.out.print(binarySearch(k));
    }

    static long binarySearch(long k) {

        long start = 0, end = (long) Math.sqrt(k);
        while (start < end) {

            long mid = start + (end - start) / 2;

            if ((mid * mid + 3 * mid) == k) {
                return mid;
            }
            if ((mid * mid + 3 * mid) < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
