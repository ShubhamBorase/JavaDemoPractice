/*
Program 4: Write a Program to Print following Pattern.
1
8
27
64 125 216
343 512 729 1000
*/

import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in = 0;
		int col = 1;
		int num = 1;

		System.out.println("Enter The Number Of Rows");

		try{
			in = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println("Stream Closed");
		}

		for(int row = 1; row<=in; ){
			if(col<row){
				System.out.print((num*num*num)+" ");
				num++;
				col++;
				continue;
			}else if(col==row){
				System.out.print((num*num*num)+" ");
				System.out.println();
				num++;
				col=1;
				row++;
			}
		}
	}
}