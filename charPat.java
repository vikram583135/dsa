import java.util.*;

public class charPat {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // Write your code here
       for(int i=1; i<=n; i++)
       {
        for(int j=1;j<=i;j++){
            System.out.print((char)(64+i));

        }
        System.out.println();
       }
    }
}