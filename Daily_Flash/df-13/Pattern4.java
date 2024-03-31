/*Write a Program to Print following Pattern.
3
2 3
1 2 3
0 1 2 3
*/

import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 3;
		int num = 0;

		System.out.println("Enter The Number of Rows you Want");

		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			System.out.println("Input Stream Closed");
		}

		int row = 0;
		int col = 1;

		for(row = 1; row<=num; ){
			if(col<row){
				System.out.print(count+" ");
				count++;
				col++;
				continue;
			}else if(col==row){
				System.out.print(count+" ");
				System.out.println();
				count = 4;
				col = 1;
				row++;
				count = count-row;
			}
		}
	}
}