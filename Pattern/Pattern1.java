import java.io.*;

class Pattern1{
	public static void main(String...args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter The Total Number of Rows");
		int row = Integer.parseInt(br.readLine());

		for(int i=0; i<row; i++){
			int num = row-i-1;
			for(int j=0; j<=i; j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}