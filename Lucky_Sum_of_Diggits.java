//109A
//Lucky sum of digits
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count4 = 0;
        int count7 = 0;
        
        // Find optimal number of 4s and 7s
        while (n > 0) {
            if (n % 7 == 0) {
                count7 = n / 7;
                n = 0;
                break;
            }
            n -= 4;
            count4++;
        }
        if (n < 0) {
            System.out.println(-1);
        } else {
            // Fast O(N) string construction
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < count4; i++) {
                sb.append('4');
            }
            for (int i = 0; i < count7; i++) {
                sb.append('7');
            }
            System.out.println(sb.toString());
        }
    }
}
