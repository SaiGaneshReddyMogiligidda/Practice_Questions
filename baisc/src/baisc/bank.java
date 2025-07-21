package baisc;
import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		float base,height,area;
		System.out.println("enter values base and height");
		Scanner sc=new Scanner(System.in);
		base=sc.nextFloat();
		height=sc.nextFloat();
		area=0.5f*base*height;
		System.out.println(area);
		
		// TODO Auto-generated method stub

	}

}
