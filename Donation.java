// After the decimation, all world went into chaos. People had to rebuild the planet so Shield came up with a donation strategy. 
// They feel all the rich guys need to donate more than the poor guys. So, they make a rule. They would make a donation list in which
//  the donation of each person would be shown. But the rule is that a person can’t pay less than what has already been paid before them. 
//  Find the extra amount each person will pay, and also, tell shield the total amount of donation.

import java.util.*;

class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];

          int start =  arr[0];

           int newArr[]=new int[n];
           long sum=0;
	
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];

            if(arr[i]>start){
                newArr[i]=0;
                start=arr[i];
            }else{
                newArr[i]=start-arr[i];
                sum+=newArr[i];
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}