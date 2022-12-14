import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Flames {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();

    int i, sum = 0;

    int arr1[] = new int[26];
    int arr2[] = new int[26];
    int arr3[] = new int[26];

    int len1 = str1.length();
    int len2 = str2.length();

    for(i=0; i<len1; i++){
        arr1[str1.charAt(i) - 'a']++;
    }
    for(i=0; i<len2; i++){
        arr2[str2.charAt(i) - 'a']++;
    }

    for(i=0; i<26; i++){
        arr3[i] = Math.abs(arr1[i] - arr2[i]);
    }
    for(i=0; i<26; i++){
        sum = sum+arr3[i];
    }

    int value = sum%6;
    switch(value){

        case 0:
        System.out.print("Siblings");
        break;

        case 1:
        System.out.print("Friends");
        break;

        case 2:
        System.out.print("Love");
        break;

        case 3:
        System.out.print("Affection");
        break;

        case 4:
        System.out.print("Marriage");
        break;

        case 5:
        System.out.print("Enemy");
    }
    }
}