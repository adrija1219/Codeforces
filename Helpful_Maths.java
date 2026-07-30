//339A
//Helpful Maths
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // Extract only the numbers (ignoring the '+' signs)
        String[] numbers = s.split("\\+");
        
        // Sort the numbers lexicographically (since all inputs are 1, 2, or 3)
        Arrays.sort(numbers);
        
        // Rejoin them with '+' and print
        System.out.println(String.join("+", numbers));
        
        sc.close();
    }
}
