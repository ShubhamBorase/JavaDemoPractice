
import java.io.*;

class Pattern4{
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int row = 0;

		System.out.println("Enter The Number Of Rows You Want ");

		try{
			row = Integer.parseInt(br.readLine());
		}catch(IOException ie){
			ie.printStackTrace();
		}

		int col = 0;

		for(int i = 0; i<row; ){
			if(col<(row-i)){
				if(col%2==0)
					System.out.print("+ ");
				else
					System.out.print("= ");
				col++;
				continue;
			}
			System.out.println();
			i++;
			col = 0;
		}
	}
}