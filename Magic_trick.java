// Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
// 1. Think of a number X(don't tell Sara)
// 2. Add A(Given by Sara) to it.
// 3. Double the sum in your mind.
// 4. Add an even number B(Given by Sara) to it.
// 5. Half the amount
// 6. Subtract the initial number which you had taken from the sum
// After this Sara will tell the resulting amount without knowing the initial number, can you print the result for her?


import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = 10;
        int S = (X+A);
        int P = (2*S);
        int T = (B+P);
        int Y = (T/2);
        int Z = (Y-X);
        System.out.println(Z);
    }
}
