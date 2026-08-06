//131A
//Caps_Lock
import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        // Check if all characters from index 1 onwards are uppercase
        boolean shouldFlip = true;
        for (int i = 1; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                shouldFlip = false;
                break;
            }
        }
        
        if (shouldFlip) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (Character.isUpperCase(ch)) {
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(Character.toUpperCase(ch));
                }
            }
            System.out.println(result.toString());
        } else {
            System.out.println(word);
        }
        
        sc.close();
    }
}
