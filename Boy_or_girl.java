//236A
//boy or girl 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Set<Character>dictionary = new HashSet<>();
		
		for(int i=0; i<s.length(); i++){
		    dictionary.add(s.charAt(i));
		}
		if(dictionary.size() % 2==0){
		    System.out.println("CHAT WITH HER!");
		}else{
		    System.out.println("IGNORE HIM!");
		}
	}
}
