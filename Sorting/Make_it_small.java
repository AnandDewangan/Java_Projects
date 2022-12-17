// Given an array of N integers and one operation in which you can choose any two indices i and j ( i != j) such that | Aj - Ai | = 1 and remove the smallest of these two numbers from the array.
// Your task is to check whether you can make the array consisting of only one element by doing this operation any number of times.

package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Make_it_small {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0, count = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] - arr[i] == 1) {
                count++;
            }
            i++;
        }
        if ((n - count) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
