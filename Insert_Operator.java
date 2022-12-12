// You are given a sequence of numbers of size N. You have to find if there is a way to insert + or - operator in between the numbers so that the result equals K.
import java.util.Scanner;

class Insert_Operator{
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long x = sc.nextLong();
    long arr[] = new long[n];
    
    for(int i=0; i<n; i++){
        arr[i] = sc.nextLong();
    }
    boolean res = insertOperator(arr, x, 1, arr[0]);
    
    if(res){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
    }

    public static boolean insertOperator(long arr[], long x, int idx, long ans){
       
       if(idx==arr.length){
           if(x==ans){
               return true;
           }
           else{
               return false;
           }
       }
       boolean pos1 = insertOperator(arr, x, idx+1, ans-arr[idx]);
       boolean pos2 = insertOperator(arr, x, idx+1, ans+arr[idx]);

       return pos1 || pos2;
    }
}