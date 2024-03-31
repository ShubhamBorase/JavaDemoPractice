
import java.io.*;

class Pattern5{
	public static void main(String...args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in = 0;

		System.out.println("Enter The Number of Rows");

		try{
			in = Integer.parseInt(br.readLine());
		}catch(IOException io){
		}

		int col = 1;

		for(int row = 1; row<=in; ){
			if(col<row){
				if(row%2==1){
					System.out.print("* ");
					col++;
					continue;
				}else{
					System.out.print("$ ");
					col++;
					continue;
				}
			}else if(col==row){
				if(row%2==1){
					System.out.print("* ");
					col = 1;
				}else{
					System.out.print("$ ");
					col++;
					col = 1;
				}
				row++;
				System.out.println();
			}
		}
	}
}
