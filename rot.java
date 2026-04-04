/*

Rotate array
Given an array with N elements, the task is to rotate the array to the right by K steps.

Note : if K is negative , rotate the array to the left.

Input Format
The first line contains an integer N representing the size of the array.

The second line contains N space-separated integers representing the elements of the array.

The last line contains an integer K representing the number of times the array has to be rotated in the right direction if k is positive , otherwise to the left if k is negative.

Output Format
The only line of the output prints N space-separated integers representing the Rotated array elements.

Example 1
Input


8
7 5 2 11 2 43 1 1
2

Output

1 1 7 5 2 11 2 43 

Explanation

Rotate 1 steps to the right : 1 7 5 2 11 2 43 1

Rotate 2 steps to the right : 1 1 7 5 2 11 2 43

Example 2
Input


8
7 5 2 11 2 43 1 1
3

Output


43 1 1 7 5 2 11 2 

Explanation

Rotate 1 steps to the right : 1 7 5 2 11 2 43 1

Rotate 2 steps to the right : 1 1 7 5 2 11 2 43

Rotate 3 steps to the right : 43 1 1 7 5 2 11 2

Constraints
1 <= N <= 10^3

1 <= arr[i] <= 10^9

-10^9 <= K < 10^9
*/
import java.util.Arrays;
import java.util.Scanner;

public class rot {

     public static void reverseArray(int arr[],int start,int end)
    {
        
       
    while (start < end) {
        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Move pointers inward
        start++;
        end--;
    }
    }

    public static void rotateArray(int[] nums, int k) {
           // write your code here
           int n = nums.length;
           // Normalize k to handle negative and large values
           k = ((k % n) + n) % n;
           
           if (k == 0) return;
           
           // Reverse first (n-k) elements
           reverseArray(nums, 0, n - k - 1);
           // Reverse last k elements
           reverseArray(nums, n - k, n - 1);
           // Reverse entire array
           reverseArray(nums, 0, n - 1);
    }

  
    public static void rotateArr(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(arr, k);
        
        for(int num : arr){
            System.out.print(num + " "); 
        }
        
        scanner.close();
    }
}
