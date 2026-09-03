//1154A
//Restroring three numbers
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr=new int[4];
		for(int i=0; i<4; i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int total=arr[3];
		int a=total-arr[0];
		int b=total-arr[1];
		int c=total-arr[2];
		System.out.println(a+" "+b+" "+c);
	}
}
