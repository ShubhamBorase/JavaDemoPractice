
import java.util.*;
import java.io.*;

class Capitalize5{
	public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The String");
		String str=br.readLine();
		String str2="";

		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()){
			StringBuffer sb=new StringBuffer(st.nextToken());
			String letter1=sb.substring(0,1);
			letter1=letter1.toUpperCase();

			String letter2=sb.substring(1,sb.length());

			str2=(str2+" "+letter1+letter2).toString();
		}
		str=str2.toString();
		System.out.println(str);
	}
}
