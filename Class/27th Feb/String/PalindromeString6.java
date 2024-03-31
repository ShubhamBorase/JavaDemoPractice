

import java.io.*;

class PalindromeString6{
	public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The String");
		String str=br.readLine();
		String str2="";

		StringBuffer sb=new StringBuffer(str);

		str2=sb.reverse().toString();
		System.out.println(str2);

		if(str.compareToIgnoreCase(str2)==0){
			System.out.println("String "+str+" is a Palimdrome");
		}else
			System.out.println("String "+str+" is not a Palindrome");
	}
}
