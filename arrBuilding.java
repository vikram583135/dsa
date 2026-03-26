/*
Buildings
You have given a number n, representing the size of array arr.

You are required to print a building representing value of arr using *.

Input Format
First line consists of an integer n

Second line consists of n spaced integers, representing elements of arr

Output Format
Output the height of the building represented by the values of array arr using *

Example 1
Input

7
9 3 7 6 2 0 4
Output

*
*
*               *
*               *       *
*               *       *
*               *       *                       *
*       *       *       *                       *
*       *       *       *       *               *
*       *       *       *       *               *
Explanation

Number of stars in each column represents the value of that index of array arr which are tab seprated
 */
import java.util.*;

public class arrBuilding {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    buildings(arr, n);
  }

  public static void buildings(int[] arr, int n) {
    // your code here
    int max = Integer.MIN_VALUE;

    for (int i=0; i<n; i++ ){
      if(arr[i]>max)
      max=arr[i];
    }
    for (int i=1; i<=max; i++ ){
      for(int j=0; j<n;j++){
        if(arr[j]>=(max-i+1))
        System.out.print("* ");
        else
        System.out.print("  ");
      }
      System.out.println();

    }
    
  }
}