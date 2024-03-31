

import java.io.*;

class RowColOdd4{
	public static void main(String...args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Number Of Rows");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Enter The Number Of Columns");
		int col=Integer.parseInt(br.readLine());

		int [][] arr = new int[row][col];

		int temp=1;
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				System.out.print(temp+" ");
				temp=temp+2;
			}
			System.out.println();
		}
	}
}
