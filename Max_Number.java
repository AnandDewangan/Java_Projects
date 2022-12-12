// Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.
import java.io.*;
import java.util.*; 
class Main {
    public static void main (String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String str[] = br.readLine().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(str[i]);
            }
            int m1=0, m2=0, m3=0;
            for(int i=0; i<n; i++){
                if(arr[i]>m1){
                    m3 = m2;
                    m2 = m1;
                    m1 = arr[i];
                }
                else if(arr[i]>m2){
                    m3 = m2;
                    m2 = arr[i];
                }
                else if(arr[i]>m3){
                    m3 = arr[i];
                }
            }
            System.out.println(m1+" "+m2+" "+m3);
        }
    }
}
    

