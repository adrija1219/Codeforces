//118B
//presents from lena
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=-n; row<=n; row++){
		    //-3 -2 -1 0 1 2 3
		    //6 4  2 0 2 4 6 --> spaces
		    int spaces = 2*Math.abs(row);
		    for(int i=0; i<spaces; i++){
		        System.out.print(" ");
		    }
		    int max = n-Math.abs(row);
		    System.out.print(0);
		    for(int i=1; i<=max; i++){
		        System.out.print(" "+i);
		    }
		    for(int i=max-1; i>=0; i--){
		        System.out.print(" "+i);
		    }
		    
		    System.out.println();
		}
	}
}
