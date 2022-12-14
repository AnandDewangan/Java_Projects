import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        long k = sc.nextLong();
        int arr[] = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i]=sc.nextInt();
        }
        int end = 1;
        long sum = 0;
        int ans = 0;
        int min_length = n;
        for(int start=1; start<=n; start++){
            while(sum < k && end<=n){
                sum += arr[end];
                end++;
            }
            if(sum>=k){
                min_length = Math.min(min_length, end-start);
            }
            sum -= arr[start];
        }
        System.out.println(min_length);
    }
}