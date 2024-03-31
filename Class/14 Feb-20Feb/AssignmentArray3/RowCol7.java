


import java.io.*;

class RowCol7{
	public static void main(String...args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Number Of Rows");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Enter The Number Of Colums");
		int col=Integer.parseInt(br.readLine());
		System.out.println("Enter The Initializer");
		int n=Integer.parseInt(br.readLine());

		int [][]arr=new int [row][col];
		int temp=n;
		for (int i=0; i<row; i++){
			for (int j=0; j<col; j++){
				arr[i][j]=n;
				
				System.out.print(n+" ");

				if (temp==n){
					n=n*10;
				}else
					n++;
			}
			System.out.println();
		}

	}
}
