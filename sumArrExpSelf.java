/*Sum of Array Except Self
Given an array of n integers where n > 1, return an array output such that output[i] is equal to the sum of all the elements of nums except nums[i]. All integers in array are greater than 0.

Input Format
First line consists of an integer n which is the number of elements in array

Next n lines correspond to n elements of array

Output Format
Return the resultant array as asked in question.

Example 1
Input

4
4 3 2 10
Output

15 16 17 9
Explanation

After updation,

a[0]=15 i.e., 3+2+10

a[1]=16 i.e., 4+2+10

a[2]=17 i.e., 4+3+10

a[3]=9 i.e., 4+3+2

Constraints
1 <= n <= 5000

1 <= a[i] <= 1000000

It is guaranteed that the sum of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
*/
import java.util.*;

public class sumArrExpSelf {

    public static int[] SumArrayExpectSelf(int[] nums, int n) {
        // Step 1: Calculate the total sum of all elements in the array
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        // Step 2: Create a result array where each index is totalSum - nums[i]
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = totalSum - nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int[] Ans = SumArrayExpectSelf(nums, n);

            for (int a : Ans)
                System.out.print(a + " ");
        }
    }
}