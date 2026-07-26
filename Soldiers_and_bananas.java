//546A
//soldiers and bananas
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=w; i++){
		    int multi = i*k;
		    sum+=multi;
		}
		if(sum>n){
		    int output= sum - n;
		    System.out.println(output);
		}else{
		    System.out.println("0");
		}
		
	}
}
