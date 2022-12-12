// Rick's family and Jerry are playing Tic Tac Toe. Rules are simple:
// Game is played in pairs.
// If Rick plays against anyone, Rick wins.
// If Jerry plays against anyone, Jerry Loses.
// A game between any other players is a draw.
// Given a pair of players, find who wins the game or if the game is draw.

import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        if(a=='R' || c=='R') {
         System.out.print("R");
        }
         else if(a =='J') {
         System.out.print(c);
         }
         else if(c == 'J') {
         System.out.print(a);
         }
         else {
         System.out.print("D");
         }

    }
    
}
