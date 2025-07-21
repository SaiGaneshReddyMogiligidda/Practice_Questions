package baisc;
import java.util.Scanner;

public class cube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b,h;
		int area,volume;
		System.out.println("enter a values of l b and h");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		area=2*(l*b+l*h+b*h);
		volume=l*b*h;
		System.out.println(area+"  "+volume);
		
		
		// TODO Auto-generated method stub

	}

}
