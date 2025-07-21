package baisc;
import java.util.*;
public class Memu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("===");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		
		System.out.println("enter 2 number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.nextLine();
		System.out.println("enter option in words");
		String options=sc.nextLine();
	    switch(options) {
	    case "ADD":System.out.println(x+y);
	    break;
	    case "SUB":System.out.println(x-y);
	    break;
	    case "MUL":System.out.println(x*y);
	    break;
	    case "DIV":System.out.println(x/y);
	    break;
	    case "def":System.out.println("invalid");
	    
	    }
		
		// TODO Auto-generated method stub

	}

}
