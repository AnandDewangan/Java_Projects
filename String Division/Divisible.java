import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Divisible {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		if (isSubSeqDivisible(str))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
	
	static boolean isSubSeqDivisible(String str){
	    int i,sum=0, l = str.length();
        
        
        for (i = 0; i < l; i++)
            sum = sum+(str.charAt(i) - '0');

        if(str.charAt(l-1)=='0'){
            if(sum%3==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
            
        
    }
}