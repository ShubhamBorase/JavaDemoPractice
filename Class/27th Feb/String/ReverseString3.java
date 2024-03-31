


import java.util.*;
import java.io.*;

class ReverseString3{
	public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The String");
		String str2="";
		String str=br.readLine();

		StringTokenizer st=new StringTokenizer(str);

		while (st.hasMoreTokens()){
			StringBuffer sb=new StringBuffer(st.nextToken());
			str2=str2+" "+sb.reverse().toString();
			str=str2.toString();
		}
		System.out.println(str);
	}
}
