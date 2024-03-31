

import java.io.*;


class JaggedStar9{
	public static void main(String...args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int row=Integer.parseInt(br.readLine());
		char[][]arr= new char [row][];

		char ch='*';


		for (int i=0; i<row; i++){
			for (int j=0; j<=i; j++){
				arr[i][j]=ch;
			}
		}

		for (int i=0; i<arr.length; i++){
			for (int j=0; j<arr.length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
