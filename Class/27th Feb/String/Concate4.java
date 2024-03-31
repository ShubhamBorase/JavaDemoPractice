

import java.io.*;

class Concate4{
	public static void main(String...args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Total Number Of Strings You want To Enter");
		int in=Integer.parseInt(br.readLine());
		String [] str=new String [in];
		String str2="";
		
		System.out.println("Enter The Strings To Concate");
		for (int i=0; i<in; i++){
			str[i]=br.readLine();
		}

		for (int i=0; i<in; i++){
			str2=str2+" "+str[i];
		}

		System.out.println(str2);
	}
}
