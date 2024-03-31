

import java.io.*;
import java.util.*;

class RemoveChar8{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The String");

		String str=br.readLine();
		StringBuffer sb =new StringBuffer(str);
		char []arr=str.toCharArray();

		System.out.println("Enter The Letter To Replace");
		char ch=(char)br.read();

		int r=0;

		for (int i=0; i<arr.length; i++){
			if(arr[i]==ch){

				sb.delete(arr[i]);
			}
		}
		System.out.println(sb);

	}
}
