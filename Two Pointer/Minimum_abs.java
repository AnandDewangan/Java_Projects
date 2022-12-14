import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N];

    for(int i=0; i<N; i++){
        A[i] = sc.nextInt();
        B[i] = sc.nextInt();
    }

    Arrays.sort(A);
    Arrays.sort(B);

    int i=0,j=0;
    int res = Integer.MAX_VALUE;

    while(i<N && j<N){
        if(Math.abs(A[i] - B[j])<res){
            res = Math.abs(A[i] - B[j]);
        }
        if(A[i]<B[j]){
            i++;
        }
        else{
            j++;
        }
    }
    System.out.print(res);
    }
}