//Chewbacca and Number
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String ans = "";
        for(int i=0; i<x.length(); i++){
            char c = x.charAt(i);
            if(c == '9'&& i==0){  //first digit
                ans+= ""+c;
            }else if(c < '5'){
               ans += ""+c; 
            }else{
                ans += "" + ('9'-c);
            }
        }
        System.out.print(ans);
	}
}
