package baisc;
import java.util.*;

public class Forloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=sc.nextInt();
		while(n>0) {
			int r=n%10;
			n=n/10;
			System.out.println(r);
			
		}
		System.out.println(n);
		
		// TODO Auto-generated method stub

	}

}
