// Sara loves triangles. Whenever she sees three points she connects them by straight lines to form a triangle. In triangles, her favorite one is a right-angled triangle. If the triangle is not right-angled but it can be converted into one by moving one of the points exactly by distance 1 so, that all the coordinates remain integer, she calls such triangles "Special".
// Given three points A, B, and C your task is to check if the formed triangle is "Right", "Special" or "Simple".


import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] d = new int[6];

        for(int i=0; i<6; i++){
            d[i] = sc.nextInt();
        }
        boolean isRight = solve(d);
        String res = "Simple";

        if(isRight){
            res ="Right";
        }
        else{
            for(int i=0; i<6; i++){
                d[i]--;
                if(solve(d)){
                    res = "Special";
                    break;
                }
                d[i]+=2;
                if(solve(d)){
                    res = "Special";
                    break;
                }
                d[i]--;
            }
        }
        System.out.println(res);
    }
    static boolean solve(int[] d){
        int a,b,c;
        a = square(d[0]-d[2])+square(d[1]-d[3]);
        b = square(d[0]-d[4])+square(d[1]-d[5]);
        c = square(d[2]-d[4])+square(d[3]-d[5]);

        if(a+b==c || a+c==b || b+c==a){
            return true;
        }
        return false;
    }

    static int square(int a){
        return a*a;
    }
}