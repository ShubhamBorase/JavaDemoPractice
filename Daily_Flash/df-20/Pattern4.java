
import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = 0;

		System.out.println("Enter The Number Of Rows");

		try{
			row = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		for(int i = 0; i<row; i++){
			
			char ch = 'A';

			for(int j = 0; j<row-i-1; j++){
				System.out.print("  ");
			}

			for(int j = 0; j<i+1; j++){
				System.out.print(ch+++" ");
			}

			System.out.println();
		}
	}
}