//1303A
//Erasing_zeros
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        
        while (testCases-- > 0) {
            String s = sc.next();
            boolean seenOne = false;
            int countZeros = 0; // Fixed variable name
            
            for (char ch : s.toCharArray()) {
                if (ch == '1') {
                    seenOne = true;
                } else if (seenOne && ch == '0') {
                    countZeros++; // Matches declaration
                }
            }
            
            if (!seenOne) {
                System.out.println('0');
                continue;
            }
            
            int trailingZeros = 0;
            for (int i = s.length() - 1; i >= 0 && s.charAt(i) == '0'; i--) {
                trailingZeros++;
            }
            
            System.out.println(countZeros - trailingZeros); // Matches declaration
        }
    }
}
