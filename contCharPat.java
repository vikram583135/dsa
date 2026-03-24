/*Print Continuous Character Pattern
Given an integer n that denotes the number of rows to be printed, print the pattern in which each row starts with its corresponding alphabet and has a length equal to the row number. (See the examples for a better understanding).

Note: You can take the alphabet to be cyclic. On reaching Z, you will cycle back to A, then B, and so on.

Input Format
First line contains the value n representing the number of rows.

Output Format
Print the pattern.

Example 1
Input

5
Output



Example 2
Input

8
Output
A
BC
CDE
DEFGH
EFGHIJ
FGHIJKL
GHIJKLMN
HIJKLMNO
 */

import java.util.*;

public class contCharPat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        // write code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                char ch = (char) ('A' + (i + j-2) % 26);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}