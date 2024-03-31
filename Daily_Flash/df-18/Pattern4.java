
import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = 0;

		System.out.println("Enter The Number of Rows ");

		try{
			row = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int col = 0;
		int num = 7;

		for(int i = 0; i<row; ){
			if(col<(row-i)){
				System.out.print(num+" ");
				num = num+7;
				col++;
				continue;
			}
			System.out.println();
			col = 0;
			i++;
		}
	}
}