// Given three integers your task is to calculate the maximum integer among the given integers.
import java.util.*;

class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b && a>c){
        System.out.println(a);
    }
    else if(b>a && b>c){
        System.out.println(b);
    }
    else{
        System.out.println(c);
    }
    }
}
    
