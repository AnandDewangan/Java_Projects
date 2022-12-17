// Given a binary array A[] of size N. The task is to arrange an array in increasing order.

import java.util.Scanner;

public class BinaryNumber {
  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sortBinaryArray(arr, n);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void sortBinaryArray(int arr[], int n) {
    int j = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] < 1) {
        j++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
  }
}
