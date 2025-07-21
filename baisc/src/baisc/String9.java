package baisc;

import java.util.Arrays;

public class String9 {
	public static void main(String[] args) {
		String str="      abc         def            ghi         ";
		str=str.replaceAll("\\s","" ).trim();
		String words[]=str.split("\\s");
		System.out.println(Arrays.toString(words));
		
	}

}
