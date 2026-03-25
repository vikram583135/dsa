import java.util.*;

public class ncr {
    public static long fact(long n){
        long ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=ans*i;
        }
        return ans;
    }

    static long calculate_nCr(int n, int r) {
        // write code here
       long nf=fact(n);
       long rf=fact(r);
       long nmrf=fact(n-r);
       long ans = nf/(rf*nmrf);
       return ans;

    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.print(ans);
    }
}