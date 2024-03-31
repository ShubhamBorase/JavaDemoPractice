

import java.io.*;

class Pattern5{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		int in = 0;

		System.out.println("Enter Number of Rows");

		try{
			in = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		int col = 1;
		for(int row = 1; row<=in; ){
			if(col<row){
				System.out.print(num+" ");
				num++;
				col++;
				continue;
			}else if(col==row){
				System.out.print(num);
				System.out.println();
				num++;
				col = 1;
				row++;
			}
		}
	}
}
