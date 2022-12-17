// Given a string s, find the first non-repeating character in the string and return its index. If it does not exist, return -1.

import java.util.HashMap;
import java.util.Scanner;

public class First_NonRepeating {
  public static void main(String[] args) {
    // Your code here
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    System.out.println(uniqueChar(s));
  }

  static int uniqueChar(String s) {

    HashMap<Character, Integer> hm = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (hm.containsKey(s.charAt(i))) {
        int val = hm.get(s.charAt(i));
        hm.put(s.charAt(i), val + 1);
      } else {
        hm.put(s.charAt(i), 1);
      }
    }
    for (int i = 0; i < s.length(); i++) {
      if (hm.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
