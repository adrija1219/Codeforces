//151A
//Soft Drinking
//n = number of friends
// k = number of bottles
// l = ml per bottles
// c = numbers of limes
// d = slices of limes
// p = gram of Salt 
 
// toast karne k liye
// nl = min ml of drink per person to have
// np = min gram of salt per person to have
// 1 slice per person
 
// Tdrink = k*l 
// TLime = c*d 
 
// per group k hisab se 
// nL*n = drink 
// np*n = salt 
// m = slice of lime 
 
 
 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		
		int nl = sc.nextInt();
		int np = sc.nextInt();
		int Tdrink = k*l;
		int Tlime = c*d;
		
		nl*=n;
		np*=n;
		int ans = 0;
		while(Tdrink >=nl && Tlime >=n && p>=np){
		    Tdrink-=nl;
		    p-=np;
		    Tlime-=n;
		    ans++;
		}
		System.out.println(ans);
	}
}
