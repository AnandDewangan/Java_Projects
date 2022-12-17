// Given an array A[], of length N containing zero , positive and negative integers.
// You need to find the length of the largest subarray whose sum of elements is 0.

import java.util.*;

public class Largest_Sum {
  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(countSubArrays(arr, n));
  }

  static int countSubArrays(int arr[], int n) {
    HashMap<Integer, Integer> hm = new HashMap<>();

    int sum = 0;
    int max_length = -1;

    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum == 0) {
        max_length = i + 1;
      }
      Integer prevIndex = hm.get(sum);

      if (prevIndex != null) {
        max_length = Math.max(max_length, i - prevIndex);
      } else {
        hm.put(sum, i);
      }

    }
    return max_length;
  }
}
