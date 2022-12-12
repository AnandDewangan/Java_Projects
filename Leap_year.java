// Given a year(an integer variable) as input, find if it is a leap year or not.
// Note: Leap year is the year that is multiple of 4.But, multiples of 100 which are not multiples of 400 are not leap years.

import java.util.*;

class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}