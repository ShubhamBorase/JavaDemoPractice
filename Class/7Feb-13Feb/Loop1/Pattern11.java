

import java.io.*;

class Pattern11{
	public static void main(String...args) throws IOException{
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.println("Enter The No of Rows");
		int limit=Integer.parseInt(br.readLine());

		char ch=64;
		for (int row=1; row<=limit; row++){
			ch+=limit;
			for (int col=1; col<=limit; col++){
				System.out.print(ch-- +" ");
			}
			System.out.println();
		}
	}
}
