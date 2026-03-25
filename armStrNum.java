/*
Armstrong Numbers in Range
You are given two numbers m and n, you are required to print all the Armstrong Numbers between m and n (both inclusive).

Armstrong Numbers are numbers those have the sum of their own digits raised to the power number of digits equals the number itself. Eg. 153 = 13 + 53 + 33, so 153 is an Armstrong number.

Input Format
First line contains two integers m and n

Output Format
Print all the Armstrong numbers between m and n in a single line with space   in between.

Example 1
Input

0 160
Output

0 1 2 3 4 5 6 7 8 9 153
Constraints
0 <= m <= n <= 105
 */
import java.util.*;

public class armStrNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            // Handle 0 specifically as it's an Armstrong number
            if (i == 0) {
                System.out.print(0 + " ");
                continue;
            }

            int temp = i;
            int digits = 0;
            
            // Step 1: Count number of digits
            int countTemp = i;
            while (countTemp > 0) {
                countTemp /= 10;
                digits++;
            }

            // Step 2: Calculate Armstrong sum
            int sum = 0;
            temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits); // Raise digit to the power of 'digits'
                temp /= 10;
            }

            // Step 3: Check condition AFTER the loop
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}