//116A
//Tram
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][]nums = new int[n][2];
		for(int i=0; i<n; i++){
		    nums[i][0] = sc.nextInt();
		    nums[i][1] = sc.nextInt();
		}
		int Current_cap = 0;
		int max_capacity = 0;
		for(int i=0; i<n; i++){
		    Current_cap += nums[i][1] - nums[i][0];
		    
		    if(Current_cap>max_capacity){
		        max_capacity=Current_cap;
		    }
		}
		System.out.println(max_capacity);
	}
}
