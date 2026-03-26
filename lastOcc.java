/*Last occurrence in unsorted array
Given an unsorted integer array of size n. Find the last occurrence of a given key.

The key is always present in the array.

Input Format
First line contains two spaced integers representing the array size n and key.

Next line contains n-spaced integers representing array a.

Output Format
Print the last index of the key in the array.

Example 1
Input

7 5
8 5 1 4 5 3 2
Output

4
Explanation

According to 0-based indexing, the last occurrence of key 5 is at index 4.

Example 2
Input

7 10
10 1 5 9 8 3 10
Output

6
Explanation

According to 0-based indexing, the last occurrence of key 10 is at index 6.

Constraints
1 <= n <= 10^6

1 <= key <= 10^3

1 <= arr[i] <= 10^3 
*/
import java.util.*;

public class lastOcc {
    public static void findIndex(int key, int[] arr) {
        //Your code goes here
        int lc=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            lc=i;
        }
        System.out.print(lc);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        findIndex(key, arr);
        sc.close();
    }
}