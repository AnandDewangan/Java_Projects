// Sara is fond of ice- cream initially she had N icecreams with her. If Sara eats exactly half of the ice cream she has in a day and the remaining icecreams get tripled each night. How many ice creams does Sara have at the end of D days?

// Note:- Take floor value while dividing by 2.
import java.util.*;

class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(Icecreams(n, d));
    }

    public static int Icecreams(int N, int D) {
        while (D > 0) {
            int e = N - N / 2;
            N = 3 * e;
            D--;
        }
        return N;
    }
}
