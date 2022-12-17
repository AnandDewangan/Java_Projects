// Given an array arr[] of size N containing 0s and 1s only. The task is to count the subarrays having an equal number of 0s and 1s.

import java.util.*;

public class Subarrya {
  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print(countSubarr(arr, n));
  }

  static long countSubarr(int arr[], int n) {

    HashMap<Integer, Integer> um = new HashMap<>();
    int curr_sum = 0;

    for (int i = 0; i < n; i++) {
      curr_sum += (arr[i] == 0) ? -1 : arr[i];
      um.put(curr_sum, um.get(curr_sum) == null ? 1 : um.get(curr_sum) + 1);

    }
    long count = 0;
    for (Map.Entry<Integer, Integer> itr : um.entrySet()) {
      if (itr.getValue() > 1) {
        count += ((itr.getValue() * (itr.getValue() - 1)) / 2);
      }
    }
    if (um.containsKey(0)) {
      count += um.get(0);
    }
    return count;
  }
}
