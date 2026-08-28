//630C
//Lucky numbers
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long n= sc.nextLong();
		long result = (1L<<(n+1))-2;
		System.out.println(result);
		
	}
}
