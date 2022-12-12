
import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(RotationPolicy(A, B));
    }

    static int RotationPolicy(int A, int B) {
        int count = 0;
        for (int i = A; i <= B; i++) {
            if ((i - 1) % 2 != 0 && (i - 1) % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}