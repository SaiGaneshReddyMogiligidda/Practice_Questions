package baisc;
import java.util.*;

public class LeapYear{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year");
		int year=sc.nextInt();
		sc.nextLine();
		if(year%4==0||year%100!=0&&year%400==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
		
	}
}
