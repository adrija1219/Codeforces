//Meeting Friends
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min =Math.min(a,b);
		min =Math.min(min,c);
		int max = Math.max(a,b);
		max = Math.max(max,c);
		System.out.println(max-min);
	}
}
