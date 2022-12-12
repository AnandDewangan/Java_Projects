// Given an integer array A of size N. Find the sum of GCD (Greatest Common Divisor) of all elements with their frequency.

import java.util.*;
class Main {
    public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum =0;
		int size = sc.nextInt();

		int arr[] = new int[size];
     
		for (int i=0; i<arr.length; i++) {
			int input = sc.nextInt();

			arr[i] = input;
		}

		int frequency[] = new int[100001];
		
		for (int i=0; i<size; i++) {//123
			frequency[arr[i]]++;//4
		}

		for (int i=0; i<size; i++) {
			 sum += GetGDC(arr[i], frequency[arr[i]]);//2
	        
		}
        System.out.print(sum);

	}
	public static int GetGDC(int a, int b){
		int min = Math.min(a,b);
		while(min>0){
			if(a%min==0 && b%min==0){
				break;
			}
			min--;
		}
		return min;
	}
}