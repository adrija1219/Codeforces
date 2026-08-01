//1097A
//Gennady and a card game
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String tcard = sc.next();
	   int flag =0;
	   
	   for(int i=0; i<5; i++){
	       String ourcard = sc.next();
	       if(tcard.charAt(0)==ourcard.charAt(0) ||tcard.charAt(1)==ourcard.charAt(1)) {
	           flag++;
	       System.out.println("YES");
	       return;
	       }
	   }
	   System.out.println("NO");
	}
}
