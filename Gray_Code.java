// You are given a decimal number n. You need to find the gray code of the number n and convert it into decimal.

// Binary to Gray conversion :
// 1. The Most Significant Bit (MSB) of the gray code is always equal to the MSB of the given binary code.
// 2. Other bits of the output gray code can be obtained by XORing binary code bit at that index and previous index.

// Eg: Gray code of 01001 is 01101

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    
            int n = sc.nextInt();
            System.out.println(grayCode(n));
		}
	}
    static int grayCode(int n){
        return n ^ (n >> 1);
    }
}