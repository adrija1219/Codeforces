//263A
//Beautiful Matrix
/******************************************************************************
0 0 0 0 0
0 0 0 0 1
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0

pass1 -> (2,4)
pass2 -> (2,3)
pass3 -> (3,3)
total 3 moves 
ans = abs(x-2) + abs(y-2)

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=-1;
		int y= -1;
		for(int i=0; i<5; i++){
		    for(int j=0; j<5; j++){
		        int a = sc.nextInt();
		        if(a==1){
		            x=i;
		            y=j;
		        }
		    }
		}
		System.out.println(Math.abs(x-2) + Math.abs(y-2));
	}
}
