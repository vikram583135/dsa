import java.util.*;

public class rigAnFib {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        long a = 0;
        long b = 1;

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for numbers in that row
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                
                // Calculate next Fibonacci number
                long next = a + b;
                a = b;
                b = next;
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}