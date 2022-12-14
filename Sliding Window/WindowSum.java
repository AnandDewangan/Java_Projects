// You are given an array arr of size n and a window of size k your task is to find that whether two adjacent windows sum can be equal to the given sum. If yes print "YES" otherwise print "NO".

import java.util.Scanner;

public class WindowSum {
    public static void main (String[] args) {
        // Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
int k = sc.nextInt();
long sum = sc.nextLong();

for(int i=0; i<n; i++){
arr[i] = sc.nextInt();
}
int window_sum = 0;
for(int i=0; i<k; i++){
window_sum += arr[i];
}

for(int i=k; i<n; i++){
int new_window_sum = window_sum+(arr[i]-arr[i-k]);
if(new_window_sum+window_sum==sum){
  System.out.println("YES");
  return;
}
window_sum = new_window_sum;
}
System.out.println("NO");
}
}
