//492A
//Vanya and cubes
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int height = 0;
		int sum = 0;
		for(int i=1; ; i++){
		    sum = sum+i;
		    if(n>=sum){
		        height++;
		        n-=sum;
		    }else{
		        break;
		    }
		}
		System.out.println(height);
	}
}
