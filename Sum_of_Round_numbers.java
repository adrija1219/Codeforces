//1352A
//Sum of round numbers
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t= sc.nextInt();
	while(t-->0){
	    String s= sc.next();
	    int n= s.length();
	    ArrayList<Integer> list = new ArrayList();
	    for(int i=0; i<n; i++){
	        if(s.charAt(i)!='0'){
	            int f= n-i-1;
	            int zero = (int)Math.pow(10, f);
	            list.add((s.charAt(i) - '0')*zero);
	        }
	    }
	    System.out.println(list.size());
	    for(int i:list){
	        System.out.print(i+" ");
	    }
	    System.out.println();
	}
	}
}
