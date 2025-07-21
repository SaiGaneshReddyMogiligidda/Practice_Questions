package baisc;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int sum=0;
		int r;
		int m=n;
		while(n>0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		System.out.println(m);
		if(sum==m) {
			System.out.println("Armstrong");
		}
			else {
				System.out.println("not");
			}
		
			
		}
		// TODO Auto-generated method stub

	}


