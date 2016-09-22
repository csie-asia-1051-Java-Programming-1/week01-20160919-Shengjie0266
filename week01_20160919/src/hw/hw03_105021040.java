package hw;
import java.util.Scanner;
public class hw03_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		float d = scn.nextFloat();
		float e = scn.nextFloat();
		float f = scn.nextFloat();
		int g =Math.round(a);
		int h =Math.round(b);
		int i =Math.round(c);
		int j =Math.round(d);
		int k =Math.round(e);
		int l =Math.round(f);
		
		int m =Math.min(g,h);
		int n =Math.min(i,j);
		int o =Math.min(k,l);
		int p =Math.min(m,n);
		int q =Math.min(n,o);
		int r =Math.min(p,q);
		System.out.println("³Ì¤p­È¬°:" + r);
	
	}

}
