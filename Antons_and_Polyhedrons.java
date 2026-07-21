//785A
//Antons and polyhedrons
/******************************************************************************
Tetrahedron. Tetrahedron has 4 triangular faces.
Cube. Cube has 6 square faces.
Octahedron. Octahedron has 8 triangular faces.
Dodecahedron. Dodecahedron has 12 pentagonal faces.
Icosahedron. Icosahedron has 20 triangular faces.
                           
n = number of Polyhedrons
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int ans = 0;
		for(int i = 0; i<n; i++){
		    String s = sc.next();
		    if(s.equals("Tetrahedron")){
		        ans+=4;
		    }else if(s.equals("Cube")){
		        ans+=6;
		    }else if(s.equals("Octahedron")){
		        ans+=8;
		    }else if(s.equals("Dodecahedron")){
		        ans+=12;
		    }else if(s.equals("Icosahedron")){
		        ans+=20;
		    }
		}
		System.out.println(ans);
	}
}
