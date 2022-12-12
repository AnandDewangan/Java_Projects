// Myra has x red colour balls and y blue colour balls. She wants to distribute these balls into identical groups without any balls left. What is the largest number of groups she can make?
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int xRed=sc.nextInt();
        int yBlue=sc.nextInt();
        int min=xRed>yBlue?yBlue:xRed;
        int count=0;
     
        System.out.println(gcd(xRed,yBlue));


    
    }
    static int gcd(int a, int b)
    {
    if (b == 0)
        return a;
        
    return gcd(b, a % b);
    }
}