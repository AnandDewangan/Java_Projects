// You are given an array arr of length "n" and a window of size "k". Your task is to find the window with zero sum. If there exists multiple windows, you need to print the first occurring window index and index start with 1 and if no such window exists print -1.


import java.util.Scanner;

public class Zero_WindowSum {
    public static void main (String[] args) {
        // Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int k = sc.nextInt();
int[] arr = new int[n];
for(int i = 0; i<n; i++){
arr[i] = sc.nextInt();
}
int sum = 0;
int start = -1;
for(int i = 0; i<k; i++){
sum = sum + arr[i];
}
if(sum == 0){
System.out.println("1");
}
else{
for(int i = k; i<n; i++){
  sum = sum + arr[i] - arr[i-k];
  if(sum ==0){
      start = i - k + 2;
      break;
  }
}
System.out.println(start);
}
}
}
