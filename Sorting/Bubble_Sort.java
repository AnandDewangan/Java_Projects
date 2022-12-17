package Sorting;

// Given an array, sort the array in reverse order by simply swapping its adjacent elements.

import java.util.Scanner;

public class Bubble_Sort {
  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int arr[] = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < N - 1; i++) {
      for (int j = 0; j < N - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < N; i++) {
      System.out.print(arr[i] + " ");
    }

  }
}
