//69A
//Young physicist
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sumx=0, sumy=0, sumz=0;
		while(n>0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    sumx+=x;
		    sumy+=y;
		    sumz+=z;
		    n--;
		}
		if(sumx==0 && sumy==0 && sumz==0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		
	}
}
