//1139B
//Chocolates
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[] a = new long[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long totalChocolates = 0;
        long maxAllowed = a[n - 1]; // Start with the last item's full capacity
        
        for (int i = n - 1; i >= 0; i--) {
            // Take the maximum possible chocolates without exceeding available stock or maxAllowed
            long take = Math.min(a[i], maxAllowed);
            totalChocolates += take;
            
            // Set the strict upper bound for the preceding item
            maxAllowed = Math.max(0, take - 1);
        }
        System.out.println(totalChocolates);
        sc.close();
    }
}
