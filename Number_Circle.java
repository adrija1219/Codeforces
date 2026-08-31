//Number circle
//1189B
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[]arr = new int[n];
		for(int i=0; i<n; i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(arr[n-2]+arr[n-3]<=arr[n-1]){
		    System.out.println("NO");
		}else{
		    System.out.println("YES");
		    System.out.println(arr[n-1]);
		    for(int i=n-3; i>=0; i--){
		        System.out.println(arr[i]+" ");
		    }
		    System.out.println(arr[n-2]);
		}
	}
}
