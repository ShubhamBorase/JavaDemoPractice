

import java.io.*;

class Ensure{
	
	static void gun()throws IOException{
		System.out.println("In Gun");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.close();
		br.readLine();
		System.out.println("In gun after readLine");
	}

	static void fun()throws IOException{
		System.out.println("In fun");
		gun();
		System.out.println("In fun after gun");
	}

	public static void main(String...args)throws IOException{
		System.out.println("In Main");
		fun();
		System.out.println("In main after fun");
	}
} 
