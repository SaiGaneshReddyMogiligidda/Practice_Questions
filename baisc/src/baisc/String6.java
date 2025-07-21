package baisc;

public class String6 {

	public static void main(String[] args) {
		String str1="a7";
		System.out.println(str1.matches("[a-z][0-9]"));
		String str2="a";
		System.out.println(str2.matches("a|b"));
		String str3="abc";
		System.out.println(str3.matches("\\w")); //w = numbers and alphabets
	    String str4="abc3def";
	    System.out.println(str4.matches("[a-z][0-4]*"));

	}

}
