// Given a natural number N, your task is to print all the digits of the number in english words. The words have to separated by space and in lowercase english letters.
import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Print_Digits(n);
    }

    static void Print_Digits(int N) {
        String s = String.valueOf(N);
        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
            }

        }

    }
}