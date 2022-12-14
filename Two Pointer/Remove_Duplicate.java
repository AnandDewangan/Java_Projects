import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
	Scanner sc =  new Scanner(System.in);
	String str = sc.next();
	char ch[] = str.toCharArray();
	Arrays.sort(ch);
	System.out.print("['"+ch[0]+"'");
	
	for(int i=1; i<5; i++){
		if(ch[i-1] != ch[i]){
			System.out.print(", '"+ch[i]+"'");
		}
	}
	System.out.print("]");
	}
}