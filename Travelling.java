// Given N cities in a line and your initial position, you want to visit all the cities at least once. You can go to one coordinate P to P+D or P-D where D is the number of steps which you choose initially. Your task is to find the maximum value of D such that you can visit all the cities at least once.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                temp[i] = x;
            } else {
                temp[i] = Math.abs(x - arr[i]);
            }
        }
        int min = temp[0];
        int max = temp[0];
        for (int i = 1; i < n; i++) {
            if (min > temp[i]) {
                min = temp[i];
            }
            if (max < temp[i]) {
                max = temp[i];
            }
        }
        int result = getGCD(min, max);
        System.out.println(result);
    }

    static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return getGCD(b, a % b);
    }
}
