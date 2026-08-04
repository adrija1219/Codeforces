//1095A
//Repeating cipher
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String t = sc.next();
        
        StringBuilder s = new StringBuilder();
        
        int index = 0;
        int step = 1;
        
        while (index < n) {
            s.append(t.charAt(index));
            index += step;
            step++;
        }
        
        System.out.println(s.toString());
        
    }
}
