/* Diamond Pattern
Given an integer N, print a diamond full of stars * with height equal to N.

Note It is given that N is odd.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains an integer N denoting the height of the pyramid.

Output Format
For each test case print the required pattern.

Example 1
Input

1
5
Output

    * 
  * * *
* * * * *
  * * *
    *
*/ 
import java.util.*;
class dimPat{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            while(t>0){
                int n=sc.nextInt();

                int x=n/2+1,cnt=1;
                for (int i = 1; i <= x; i++) {
                    for (int j = 1; j <= x - i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= cnt; j++) {
                        System.out.print("* ");
                    }
                    cnt+=2;
                    System.out.println();
                }
                cnt-=4;
                for (int i = 1; i <x; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j <= cnt; j++) {
                        System.out.print("* ");
                    }
                    cnt-=2;
                    System.out.println();
                }

                t--;
            }
        }
    }
}
