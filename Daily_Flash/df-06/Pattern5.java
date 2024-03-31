
import java.io.*;

class Pattern5{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;

		System.out.println("Enter the Number of Rows");
		try{
			num = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		int col = 1;
		for(int row = 1; row<=num;){
			if(col<num){
				System.out.print("0  ");
				col++;
				continue;
			}else if(col==num){
				System.out.print("0  ");
				System.out.println();
				col = 1;
				row++;
			}
		}
	}
}
