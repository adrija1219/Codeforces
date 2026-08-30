//1151B
//Gcd length
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    
		    //x starts as 10^(a-1)
		    int x= (int)Math.pow(10, a-1);
		    
		    //y starts as 10^(b-1)
		    int y=(int) Math.pow(10, b-1);
		    
		    //add 10^(c-1) to a so that gcd(x,y) = 10^(c-1)
		    x +=(int)Math.pow(10, c-1);
		    System.out.println(x+ " "+y);
		    
		    
		}
	}
}
