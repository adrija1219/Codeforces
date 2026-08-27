//617A
//elephant
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int minstep;
		if(n%5==0){
		    minstep = n/5;
		}else{
		    minstep = n/5+1;
		}
		System.out.println(minstep);
	}
}
