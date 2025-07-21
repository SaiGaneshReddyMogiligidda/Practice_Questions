package baisc;

public class Palindrome {

	public static void main(String[] args) {
		int n=12521;
		int m=n;
		int r;
		int rev=0;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		System.out.println(rev);
		if(rev==m) {
			System.out.println("palindrome");
		}else
		{
			System.out.println("not");
		}
		// TODO Auto-generated method stub

	}

}
