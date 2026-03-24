
/*Print Number Pattern 2
Given an integer n, print a pattern of n lines, where the ith line has the numbers i to 1 printed in descending order. Check the sample cases for a better understanding.

Input Format:
Input consists of an integer N.

Output Format:
Print the pattern as described above.

Example 1
Input:

5
Output:

Pattern
1
21
321
4321
54321
Example 2
Input:

4
Output:

Pattern
1
21
321
4321

*/
import java.util.*;

public class  priNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // your code here
        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }

}