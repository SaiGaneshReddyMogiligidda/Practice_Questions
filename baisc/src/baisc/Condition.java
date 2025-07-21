package baisc;
import java.util.*;

public class Condition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m1,m2,m3;
		float avg;
		System.out.println("enter the marks");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		avg=(m1+m2+m3)/3;
		if(avg>=90 && avg<=100) {
			System.out.println("A");
			
		}
		else if(avg>=80 && avg<=90) {
			System.out.println("c");
		}
		else {
			System.out.println("fail");
		}
		
		
		// TODO Auto-generated method stub

	}

}
