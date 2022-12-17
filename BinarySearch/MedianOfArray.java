// Given two sorted arrays A and B of size n and m respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n))

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianOfArray {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.format("%.2f", findMedianSortedArrays(a, b));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int size = list.size();

        if (size % 2 == 1) {
            return (double) list.get(size / 2);
        }
        return (double) (list.get(size / 2 - 1) + list.get(size / 2)) / 2;
    }
}
