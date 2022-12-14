import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){

            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }
            for(int i=0; i<n; i++){
                arr[i] = arr[i]*arr[i];
            }
            Arrays.sort(arr);

            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        
    }
}