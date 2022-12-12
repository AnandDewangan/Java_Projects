// Given an integer N, you need to typecast this integer to String. If the typecasting is done successfully then we will print "Nice Job" otherwise "Wrong answer".
import java.util.*;
class main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = String.valueOf(n);
    if(Integer.valueOf(str)==n){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
}
}