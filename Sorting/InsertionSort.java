package Sorting;
// Given an array A[] of size N, containing positive integers. You need to sort the elements of array using Insertion sort algorithm.
import java.util.*;

class InsertionSort {
    public static void main(String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            T--;
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int temp, j;
            for (int i = 0; i < N; i++) {
                temp = arr[i];
                j = i;

                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
}