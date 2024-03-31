
import java.io.*;

class RowCol3{
	public static void main(String...args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Number Of Rows");
		int row=Integer.parseInt(br.readLine());

		System.out.println("Enter The Number Of Columns");
		int col=Integer.parseInt(br.readLine());

		int[][] arr= new int[row][col];

		System.out.println("Enter The Elements Of Array");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
