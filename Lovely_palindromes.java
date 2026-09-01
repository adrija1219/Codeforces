//688B
//Lovely palindromes
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String rev = new StringBuilder(s).reverse().toString();

        System.out.println(s + rev);
    }
}
